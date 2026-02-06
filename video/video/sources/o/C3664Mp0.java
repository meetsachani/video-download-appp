package o;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Deprecated
/* renamed from: o.Mp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3664Mp0 {
    @Deprecated
    public static long a(String str) throws IOException {
        return f(str);
    }

    @Deprecated
    public static long b() throws IOException {
        return c(-1L);
    }

    @Deprecated
    public static long c(long j) throws IOException {
        return e(C3961Pq0.c0().getAbsolutePath(), j);
    }

    @Deprecated
    public static long d(String str) throws IOException {
        return e(str, -1L);
    }

    @Deprecated
    public static long e(String str, long j) throws IOException {
        return f(str) / 1024;
    }

    public static long f(String str) throws IOException {
        Path path;
        boolean exists;
        String path2;
        Path absolutePath;
        FileStore fileStore;
        long usableSpace;
        Objects.requireNonNull(str, "pathStr");
        path = Paths.get(str, new String[0]);
        exists = Files.exists(path, new LinkOption[0]);
        if (exists) {
            absolutePath = path.toAbsolutePath();
            fileStore = Files.getFileStore(absolutePath);
            usableSpace = fileStore.getUsableSpace();
            return usableSpace;
        }
        path2 = path.toString();
        throw new IllegalArgumentException(path2);
    }
}
