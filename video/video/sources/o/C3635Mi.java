package o;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import o.C5903dp0;

/* renamed from: o.Mi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3635Mi extends C5903dp0.b {
    public final long a;
    public final long b;
    public final Location c;
    public final ParcelFileDescriptor d;

    /* renamed from: o.Mi$b */
    /* loaded from: classes.dex */
    public static final class b extends C5903dp0.b.a {
        public Long a;
        public Long b;
        public Location c;
        public ParcelFileDescriptor d;

        @Override // o.C5903dp0.b.a, o.AbstractC5209ax1.b.a
        /* renamed from: e */
        public C5903dp0.b a() {
            String str = "";
            if (this.a == null) {
                str = " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.d == null) {
                str = str + " parcelFileDescriptor";
            }
            if (str.isEmpty()) {
                return new C3635Mi(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.C5903dp0.b.a
        public C5903dp0.b.a f(ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor != null) {
                this.d = parcelFileDescriptor;
                return this;
            }
            throw new NullPointerException("Null parcelFileDescriptor");
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: g */
        public C5903dp0.b.a b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: h */
        public C5903dp0.b.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: i */
        public C5903dp0.b.a d(Location location) {
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

    @Override // o.C5903dp0.b
    public ParcelFileDescriptor d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5903dp0.b) {
            C5903dp0.b bVar = (C5903dp0.b) obj;
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
        return "FileDescriptorOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=" + this.c + ", parcelFileDescriptor=" + this.d + "}";
    }

    public C3635Mi(long j, long j2, Location location, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = j;
        this.b = j2;
        this.c = location;
        this.d = parcelFileDescriptor;
    }
}
