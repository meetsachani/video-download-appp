package o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import o.C3536Lh1;

/* renamed from: o.Yi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4804Yi extends C3536Lh1.b {
    public final long a;
    public final long b;
    public final Location c;
    public final ContentResolver d;
    public final Uri e;
    public final ContentValues f;

    /* renamed from: o.Yi$b */
    /* loaded from: classes.dex */
    public static final class b extends C3536Lh1.b.a {
        public Long a;
        public Long b;
        public Location c;
        public ContentResolver d;
        public Uri e;
        public ContentValues f;

        @Override // o.C3536Lh1.b.a, o.AbstractC5209ax1.b.a
        /* renamed from: e */
        public C3536Lh1.b a() {
            String str = "";
            if (this.a == null) {
                str = " fileSizeLimit";
            }
            if (this.b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.d == null) {
                str = str + " contentResolver";
            }
            if (this.e == null) {
                str = str + " collectionUri";
            }
            if (this.f == null) {
                str = str + " contentValues";
            }
            if (str.isEmpty()) {
                return new C4804Yi(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.C3536Lh1.b.a
        public C3536Lh1.b.a f(Uri uri) {
            if (uri != null) {
                this.e = uri;
                return this;
            }
            throw new NullPointerException("Null collectionUri");
        }

        @Override // o.C3536Lh1.b.a
        public C3536Lh1.b.a g(ContentResolver contentResolver) {
            if (contentResolver != null) {
                this.d = contentResolver;
                return this;
            }
            throw new NullPointerException("Null contentResolver");
        }

        @Override // o.C3536Lh1.b.a
        public C3536Lh1.b.a h(ContentValues contentValues) {
            if (contentValues != null) {
                this.f = contentValues;
                return this;
            }
            throw new NullPointerException("Null contentValues");
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: i */
        public C3536Lh1.b.a b(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: j */
        public C3536Lh1.b.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC5209ax1.b.a
        /* renamed from: k */
        public C3536Lh1.b.a d(Location location) {
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

    @Override // o.C3536Lh1.b
    public Uri d() {
        return this.e;
    }

    @Override // o.C3536Lh1.b
    public ContentResolver e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3536Lh1.b) {
            C3536Lh1.b bVar = (C3536Lh1.b) obj;
            if (this.a == bVar.b() && this.b == bVar.a() && ((location = this.c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.d.equals(bVar.e()) && this.e.equals(bVar.d()) && this.f.equals(bVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // o.C3536Lh1.b
    public ContentValues f() {
        return this.f;
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
        return ((((((i ^ hashCode) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        return "MediaStoreOutputOptionsInternal{fileSizeLimit=" + this.a + ", durationLimitMillis=" + this.b + ", location=" + this.c + ", contentResolver=" + this.d + ", collectionUri=" + this.e + ", contentValues=" + this.f + "}";
    }

    public C4804Yi(long j, long j2, Location location, ContentResolver contentResolver, Uri uri, ContentValues contentValues) {
        this.a = j;
        this.b = j2;
        this.c = location;
        this.d = contentResolver;
        this.e = uri;
        this.f = contentValues;
    }
}
