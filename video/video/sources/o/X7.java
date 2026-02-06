package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.Instant;
import java.util.Date;

/* loaded from: classes4.dex */
public class X7 extends N0 implements Serializable {
    private static final long serialVersionUID = -2132740084016138541L;
    public final Instant Y0;
    public final boolean Z;

    public X7(Date date) {
        this(date, true);
    }

    public static /* synthetic */ FileVisitResult t(X7 x7, Path path) {
        boolean z = false;
        if (x7.Z != C11130zA1.n0(path, x7.Y0, new LinkOption[0])) {
            z = true;
        }
        return x7.q(z);
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, BasicFileAttributes basicFileAttributes) {
        return j(new XK0() { // from class: o.W7
            @Override // o.XK0
            public final Object get() {
                return X7.t(X7.this, path);
            }
        });
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(File file) {
        if (this.Z != C3961Pq0.B0(file, this.Y0)) {
            return true;
        }
        return false;
    }

    @Override // o.N0
    public String toString() {
        String str;
        if (this.Z) {
            str = "<=";
        } else {
            str = ">";
        }
        return super.toString() + C9811tl1.c + str + this.Y0 + C9811tl1.d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public X7(Date date, boolean z) {
        this(r1, z);
        Instant instant;
        instant = date.toInstant();
    }

    public X7(File file) {
        this(file, true);
    }

    public X7(File file, boolean z) {
        this(C3961Pq0.e1(file), z);
    }

    public X7(Instant instant) {
        this(instant, true);
    }

    public X7(Instant instant, boolean z) {
        this.Z = z;
        this.Y0 = instant;
    }

    public X7(long j) {
        this(V7.a(j), true);
    }

    public X7(long j, boolean z) {
        this(V7.a(j), z);
    }
}
