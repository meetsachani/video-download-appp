package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import o.HQ;

/* renamed from: o.b20  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5229b20 extends NQ {
    public final String[] b1;
    public final boolean c1;
    public final LinkOption[] d1;

    public C5229b20(HQ.j jVar, Z10[] z10Arr, String... strArr) {
        this(jVar, C11130zA1.z0(), z10Arr, strArr);
    }

    private boolean q(Path path) {
        if (Arrays.binarySearch(this.b1, C11130zA1.V(path)) < 0) {
            return true;
        }
        return false;
    }

    public static C5229b20 r() {
        return new C5229b20(HQ.b(), new String[0]);
    }

    public static C5229b20 s() {
        return new C5229b20(HQ.d(), new String[0]);
    }

    @Override // o.NQ
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C5229b20 c5229b20 = (C5229b20) obj;
        if (this.c1 == c5229b20.c1 && Arrays.equals(this.b1, c5229b20.b1)) {
            return true;
        }
        return false;
    }

    @Override // o.NQ
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.b1)) * 31) + Objects.hash(Boolean.valueOf(this.c1));
    }

    @Override // o.NQ
    public FileVisitResult j(Path path, IOException iOException) throws IOException {
        if (C11130zA1.i0(path)) {
            Files.deleteIfExists(path);
        }
        return super.j(path, iOException);
    }

    @Override // o.NQ
    public FileVisitResult k(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        FileVisitResult fileVisitResult2;
        super.k(path, basicFileAttributes);
        if (q(path)) {
            fileVisitResult2 = FileVisitResult.CONTINUE;
            return fileVisitResult2;
        }
        fileVisitResult = FileVisitResult.SKIP_SUBTREE;
        return fileVisitResult;
    }

    @Override // o.NQ
    public FileVisitResult n(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        FileVisitResult fileVisitResult;
        boolean exists;
        boolean isSymbolicLink;
        if (q(path)) {
            exists = Files.exists(path, this.d1);
            if (exists) {
                if (this.c1) {
                    C11130zA1.T0(path, false, this.d1);
                }
                Files.deleteIfExists(path);
            }
            isSymbolicLink = Files.isSymbolicLink(path);
            if (isSymbolicLink) {
                try {
                    Files.delete(path);
                } catch (NoSuchFileException unused) {
                }
            }
        }
        m(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Path path, IOException iOException) throws IOException {
        return j(N30.a(path), iOException);
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return k(N30.a(path), basicFileAttributes);
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return n(N30.a(path), basicFileAttributes);
    }

    public C5229b20(HQ.j jVar, LinkOption[] linkOptionArr, Z10[] z10Arr, String... strArr) {
        super(jVar);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : NQ.a1;
        Arrays.sort(strArr2);
        this.b1 = strArr2;
        this.c1 = EnumC3317Jb2.h(z10Arr);
        this.d1 = linkOptionArr == null ? C11130zA1.z0() : (LinkOption[]) linkOptionArr.clone();
    }

    public C5229b20(HQ.j jVar, String... strArr) {
        this(jVar, C11130zA1.d, strArr);
    }
}
