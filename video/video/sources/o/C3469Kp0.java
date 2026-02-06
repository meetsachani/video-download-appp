package o;

import java.net.URI;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.spi.FileSystemProvider;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: o.Kp0 */
/* loaded from: classes4.dex */
public class C3469Kp0 {
    public static final String b = "file";
    public static final C3469Kp0 c;
    public final List<FileSystemProvider> a;

    static {
        List installedProviders;
        installedProviders = FileSystemProvider.installedProviders();
        c = new C3469Kp0(installedProviders);
    }

    public C3469Kp0(List<FileSystemProvider> list) {
        this.a = list == null ? Collections.EMPTY_LIST : list;
    }

    public static /* synthetic */ boolean a(String str, FileSystemProvider fileSystemProvider) {
        String scheme;
        scheme = fileSystemProvider.getScheme();
        return scheme.equalsIgnoreCase(str);
    }

    public static FileSystemProvider e(Path path) {
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(path, "path");
        fileSystem = N30.a(path).getFileSystem();
        provider = fileSystem.provider();
        return provider;
    }

    public static C3469Kp0 f() {
        return c;
    }

    public FileSystemProvider b(final String str) {
        FileSystem fileSystem;
        FileSystemProvider provider;
        Objects.requireNonNull(str, "scheme");
        if (str.equalsIgnoreCase("file")) {
            fileSystem = FileSystems.getDefault();
            provider = fileSystem.provider();
            return provider;
        }
        return C3077Gp0.a(this.a.stream().filter(new Predicate() { // from class: o.Jp0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C3469Kp0.a(str, (FileSystemProvider) obj);
            }
        }).findFirst().orElse(null));
    }

    public FileSystemProvider c(URI uri) {
        Objects.requireNonNull(uri, "uri");
        return b(uri.getScheme());
    }

    public FileSystemProvider d(URL url) {
        Objects.requireNonNull(url, "url");
        return b(url.getProtocol());
    }
}
