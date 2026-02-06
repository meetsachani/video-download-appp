package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

@Deprecated
/* renamed from: o.gL2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6532gL2 extends N0 implements Serializable {
    private static final long serialVersionUID = -5037645902506953517L;
    public final String[] Z;

    public C6532gL2(List<String> list) {
        Objects.requireNonNull(list, "wildcards");
        this.Z = (String[]) list.toArray(HJ0.O);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, BasicFileAttributes basicFileAttributes) {
        boolean isDirectory;
        FileVisitResult fileVisitResult;
        isDirectory = Files.isDirectory(path, new LinkOption[0]);
        if (isDirectory) {
            fileVisitResult = FileVisitResult.TERMINATE;
            return fileVisitResult;
        }
        return N0.p(Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.fL2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean S;
                S = C4837Yq0.S(C11130zA1.V(path), (String) obj);
                return S;
            }
        }));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(final File file) {
        if (l(file)) {
            return false;
        }
        return Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.dL2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean S;
                S = C4837Yq0.S(file.getName(), (String) obj);
                return S;
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(File file, final String str) {
        if (file == null || !new File(file, str).isDirectory()) {
            return Stream.of((Object[]) this.Z).anyMatch(new Predicate() { // from class: o.eL2
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean S;
                    S = C4837Yq0.S(str, (String) obj);
                    return S;
                }
            });
        }
        return false;
    }

    public C6532gL2(String str) {
        Objects.requireNonNull(str, "wildcard");
        this.Z = new String[]{str};
    }

    public C6532gL2(String... strArr) {
        Objects.requireNonNull(strArr, "wildcards");
        this.Z = (String[]) strArr.clone();
    }
}
