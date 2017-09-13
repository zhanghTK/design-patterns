package tk.zhangh.pattern.composite;

/**
 * Created by ZhangHao on 2017/9/13.
 */
public class App {

    private static Folder root;

    static {
        root = new Folder("root");
        root.add(new TextFile("1.txt"));
        root.add(new ImageFile("1.jpg"));

        Folder folder = new Folder("folder");
        folder.add(new TextFile("2.txt"));
        folder.add(new ImageFile("2.jpg"));

        root.add(folder);
    }

    public static void main(String[] args) {
        print(root);
    }

    private static void print(FileComponent fileComponent) {
        fileComponent.display();
        if (fileComponent.getChildren() == null) {
            return;
        }
        for (FileComponent component : fileComponent.getChildren()) {
            print(component);
        }
    }
}
