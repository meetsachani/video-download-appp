package o;

import android.location.Location;
import java.io.File;
import o.C9583sp0;

/* renamed from: o.Ni  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3733Ni extends C9583sp0.b {
    public final long a;
    public final long b;
    public final Location c;
    public final File d;

    /* renamed from: o.Ni$b */
    /* loaded from: classes.dex */
    public static final class b extends C9583sp0.b.a {
        public Long a;
        public Long b;
        public Location c;
        public File d;

        @Override // o.C9583sp0.b.a, o.AbstractC5209ax1.b.a
        /* renamed from: e */
        public C9583sp0.b a() {
            String str = "";
            if (this.a == null) {
                str = " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new C3733Ni(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.C9583sp0.b.a
        public C9583sp0.b.a f(File file) {
            if (file != null) {
                this.d = file;
                return this;
            }
            throw new NullPointerException("Null file");
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: g */
        public C9583sp0.b.a b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: h */
        public C9583sp0.b.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: i */
        public C9583sp0.b.a d(Location location) {
            this.c = location;
            return this;
        }
    }

    @Override // o.AbstractC5209ax1.b
    public long a() {
        return this.b;
    }

    @Override // o.AbstractC5209ax1.b
    public long b() {
        return this.a;
    }

    @Override // o.AbstractC5209ax1.b
    public Location c() {
        return this.c;
    }

    @Override // o.C9583sp0.b
    public File d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9583sp0.b) {
            C9583sp0.b bVar = (C9583sp0.b) obj;
            if (this.a == bVar.b() && this.b == bVar.a() && ((location = this.c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.c;
        if (location == null) {
            hashCode = 0;
        } else {
            hashCode = location.hashCode();
        }
        return ((i ^ hashCode) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=" + this.c + ", file=" + this.d + "}";
    }

    public C3733Ni(long j, long j2, Location location, File file) {
        this.a = j;
        this.b = j2;
        this.c = location;
        this.d = file;
    }
}
