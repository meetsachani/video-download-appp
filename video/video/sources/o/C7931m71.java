package o;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: o.m71  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7931m71 extends N0 implements Serializable {
    private static final long serialVersionUID = -547733176983104172L;
    public final long Y0;
    public final byte[] Z;

    public C7931m71(byte[] bArr) {
        this(bArr, 0L);
    }

    public static /* synthetic */ Boolean t(C7931m71 c7931m71, RandomAccessFile randomAccessFile) {
        byte[] bArr = c7931m71.Z;
        return Boolean.valueOf(Arrays.equals(bArr, IN1.c(randomAccessFile, c7931m71.Y0, bArr.length)));
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        boolean isRegularFile;
        boolean isReadable;
        FileVisitResult q;
        if (path != null) {
            isRegularFile = Files.isRegularFile(path, new LinkOption[0]);
            if (isRegularFile) {
                isReadable = Files.isReadable(path);
                if (isReadable) {
                    try {
                        FileChannel a = C7619kq1.a(path, new OpenOption[0]);
                        ByteBuffer allocate = ByteBuffer.allocate(this.Z.length);
                        a.position(this.Y0);
                        int read = a.read(allocate);
                        byte[] bArr = this.Z;
                        if (read != bArr.length) {
                            q = FileVisitResult.TERMINATE;
                        } else {
                            q = q(Arrays.equals(bArr, allocate.array()));
                        }
                        a.close();
                        return q;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        fileVisitResult = FileVisitResult.TERMINATE;
        return fileVisitResult;
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        Path path;
        if (m(file) && file.canRead()) {
            try {
                FN1 fn1 = FN1.READ_ONLY;
                path = file.toPath();
                return ((Boolean) fn1.h(path, new RJ0() { // from class: o.l71
                    @Override // o.RJ0
                    public final Object apply(Object obj) {
                        return C7931m71.t(C7931m71.this, (RandomAccessFile) obj);
                    }
                })).booleanValue();
            } catch (IOException unused) {
                return false;
            }
        }
        return false;
    }

    @Override // o.N0
    public String toString() {
        return super.toString() + C9811tl1.c + new String(this.Z, Charset.defaultCharset()) + "," + this.Y0 + C9811tl1.d;
    }

    public C7931m71(byte[] bArr, long j) {
        Objects.requireNonNull(bArr, "magicNumbers");
        if (bArr.length == 0) {
            throw new IllegalArgumentException("The magic number must contain at least one byte");
        }
        if (j >= 0) {
            this.Z = (byte[]) bArr.clone();
            this.Y0 = j;
            return;
        }
        throw new IllegalArgumentException("The offset cannot be negative");
    }

    public C7931m71(String str) {
        this(str, 0L);
    }

    public C7931m71(String str, long j) {
        this(str.getBytes(Charset.defaultCharset()), j);
    }
}
