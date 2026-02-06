package o;

import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Dz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2808Dz1 {
    @NotNull
    public static final C2808Dz1 a = new C2808Dz1();
    public static final Path b;
    public static final Path c;

    static {
        Path path;
        Path path2;
        path = Paths.get("", new String[0]);
        b = path;
        path2 = Paths.get("..", new String[0]);
        c = path2;
    }

    @NotNull
    public final Path a(@NotNull Path path, @NotNull Path path2) {
        Path normalize;
        Path normalize2;
        Path relativize;
        int nameCount;
        int nameCount2;
        FileSystem fileSystem;
        String separator;
        FileSystem fileSystem2;
        FileSystem fileSystem3;
        String separator2;
        Path name;
        Path name2;
        C6562gT0.p(path, "path");
        C6562gT0.p(path2, C5445bv2.X);
        normalize = path2.normalize();
        normalize2 = path.normalize();
        relativize = normalize.relativize(normalize2);
        nameCount = normalize.getNameCount();
        nameCount2 = normalize2.getNameCount();
        int min = Math.min(nameCount, nameCount2);
        for (int i = 0; i < min; i++) {
            name = normalize.getName(i);
            Path path3 = c;
            if (!C6562gT0.g(name, path3)) {
                break;
            }
            name2 = normalize2.getName(i);
            if (!C6562gT0.g(name2, path3)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (C6562gT0.g(normalize2, normalize) || !C6562gT0.g(normalize, b)) {
            String obj = relativize.toString();
            fileSystem = relativize.getFileSystem();
            separator = fileSystem.getSeparator();
            C6562gT0.o(separator, "getSeparator(...)");
            if (C9545sf2.b2(obj, separator, false, 2, null)) {
                fileSystem2 = relativize.getFileSystem();
                fileSystem3 = relativize.getFileSystem();
                separator2 = fileSystem3.getSeparator();
                normalize2 = fileSystem2.getPath(C2832Ef2.f7(obj, separator2.length()), new String[0]);
            } else {
                normalize2 = relativize;
            }
        }
        C6562gT0.m(normalize2);
        return normalize2;
    }
}
