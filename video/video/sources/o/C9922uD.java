package o;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;
import o.HQ;

/* renamed from: o.uD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C9922uD extends NQ {
    public final String[] b1;
    public final boolean c1;

    public C9922uD(HQ.j jVar, Z10[] z10Arr, String... strArr) {
        super(jVar);
        String[] strArr2 = strArr != null ? (String[]) strArr.clone() : NQ.a1;
        Arrays.sort(strArr2);
        this.b1 = strArr2;
        this.c1 = EnumC3317Jb2.h(z10Arr);
    }

    public static NQ o() {
        return new C9922uD(HQ.b(), new String[0]);
    }

    public static NQ p() {
        return new C9922uD(HQ.d(), new String[0]);
    }

    @Override // o.NQ
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj) || getClass() != obj.getClass()) {
            return false;
        }
        C9922uD c9922uD = (C9922uD) obj;
        if (this.c1 == c9922uD.c1 && Arrays.equals(this.b1, c9922uD.b1)) {
            return true;
        }
        return false;
    }

    @Override // o.NQ
    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.b1)) * 31) + Objects.hash(Boolean.valueOf(this.c1));
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
        LinkOption linkOption;
        boolean exists;
        LinkOption linkOption2;
        if (q(path)) {
            linkOption = LinkOption.NOFOLLOW_LINKS;
            exists = Files.exists(path, linkOption);
            if (exists) {
                if (this.c1) {
                    linkOption2 = LinkOption.NOFOLLOW_LINKS;
                    C11130zA1.T0(path, false, linkOption2);
                }
                Files.deleteIfExists(path);
            }
        }
        m(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        return fileVisitResult;
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return k(N30.a(path), basicFileAttributes);
    }

    public final boolean q(Path path) {
        if (Arrays.binarySearch(this.b1, C11130zA1.V(path)) < 0) {
            return true;
        }
        return false;
    }

    @Override // o.NQ, java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    public /* bridge */ /* synthetic */ FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) throws IOException {
        return n(N30.a(path), basicFileAttributes);
    }

    public C9922uD(HQ.j jVar, String... strArr) {
        this(jVar, C11130zA1.d, strArr);
    }
}
