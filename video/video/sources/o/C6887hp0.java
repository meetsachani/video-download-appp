package o;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;
import java.util.Objects;

/* renamed from: o.hp0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6887hp0 implements Serializable {
    public static final C6887hp0[] d1 = new C6887hp0[0];
    private static final long serialVersionUID = -2505664948818681153L;
    public final C6887hp0 X;
    public C6887hp0[] Y;
    public String Y0;
    public final File Z;
    public boolean Z0;
    public boolean a1;
    public C9148r12 b1;
    public long c1;

    public C6887hp0(File file) {
        this(null, file);
    }

    public C6887hp0[] a() {
        C6887hp0[] c6887hp0Arr = this.Y;
        if (c6887hp0Arr != null) {
            return c6887hp0Arr;
        }
        return d1;
    }

    public File b() {
        return this.Z;
    }

    public long c() {
        return this.b1.d();
    }

    public FileTime d() {
        return this.b1.e();
    }

    public long e() {
        return this.c1;
    }

    public int f() {
        C6887hp0 c6887hp0 = this.X;
        if (c6887hp0 == null) {
            return 0;
        }
        return c6887hp0.f() + 1;
    }

    public String g() {
        return this.Y0;
    }

    public C6887hp0 h() {
        return this.X;
    }

    public boolean i() {
        return this.a1;
    }

    public boolean j() {
        return this.Z0;
    }

    public C6887hp0 k(File file) {
        return new C6887hp0(this, file);
    }

    public boolean l(File file) {
        Path path;
        boolean exists;
        boolean z;
        long j;
        FileTime fileTime;
        boolean z2 = this.Z0;
        C9148r12 c9148r12 = this.b1;
        boolean z3 = this.a1;
        long j2 = this.c1;
        this.Y0 = file.getName();
        path = file.toPath();
        exists = Files.exists(path, new LinkOption[0]);
        this.Z0 = exists;
        if (exists && file.isDirectory()) {
            z = true;
        } else {
            z = false;
        }
        this.a1 = z;
        try {
            if (this.Z0) {
                fileTime = C3961Pq0.d1(file);
            } else {
                fileTime = C4639Wp0.d;
            }
            q(fileTime);
        } catch (IOException unused) {
            r(C9148r12.Y);
        }
        if (this.Z0 && !this.a1) {
            j = file.length();
        } else {
            j = 0;
        }
        this.c1 = j;
        if (this.Z0 == z2 && this.b1.equals(c9148r12) && this.a1 == z3 && this.c1 == j2) {
            return false;
        }
        return true;
    }

    public void m(C6887hp0... c6887hp0Arr) {
        this.Y = c6887hp0Arr;
    }

    public void n(boolean z) {
        this.a1 = z;
    }

    public void o(boolean z) {
        this.Z0 = z;
    }

    public void p(long j) {
        FileTime fromMillis;
        fromMillis = FileTime.fromMillis(j);
        q(fromMillis);
    }

    public void q(FileTime fileTime) {
        r(new C9148r12(fileTime));
    }

    public void r(C9148r12 c9148r12) {
        this.b1 = c9148r12;
    }

    public void s(long j) {
        this.c1 = j;
    }

    public void t(String str) {
        this.Y0 = str;
    }

    public C6887hp0(C6887hp0 c6887hp0, File file) {
        this.b1 = C9148r12.Y;
        Objects.requireNonNull(file, "file");
        this.Z = file;
        this.X = c6887hp0;
        this.Y0 = file.getName();
    }
}
