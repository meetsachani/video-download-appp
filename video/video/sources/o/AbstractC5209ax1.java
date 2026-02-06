package o;

import android.location.Location;

/* renamed from: o.ax1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5209ax1 {
    public static final int b = 0;
    public static final int c = 0;
    public final b a;

    /* renamed from: o.ax1$a */
    /* loaded from: classes.dex */
    public static abstract class a<T extends AbstractC5209ax1, B> {
        public final b.a<?> a;

        public a(b.a<?> aVar) {
            this.a = aVar;
            aVar.c(0L);
            aVar.b(0L);
        }

        public abstract T a();

        /* JADX WARN: Multi-variable type inference failed */
        public B b(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "The specified duration limit can't be negative.");
            this.a.b(j);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B c(long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            C10907yF1.b(z, "The specified file size limit can't be negative.");
            this.a.c(j);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B d(Location location) {
            boolean z;
            if (location != null) {
                boolean z2 = false;
                if (location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d) {
                    z = true;
                } else {
                    z = false;
                }
                C10907yF1.b(z, "Latitude must be in the range [-90, 90]");
                if (location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                    z2 = true;
                }
                C10907yF1.b(z2, "Longitude must be in the range [-180, 180]");
            }
            this.a.d(location);
            return this;
        }
    }

    /* renamed from: o.ax1$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: o.ax1$b$a */
        /* loaded from: classes.dex */
        public static abstract class a<B> {
            public abstract b a();

            public abstract B b(long j);

            public abstract B c(long j);

            public abstract B d(Location location);
        }

        public abstract long a();

        public abstract long b();

        public abstract Location c();
    }

    public AbstractC5209ax1(b bVar) {
        this.a = bVar;
    }

    public long a() {
        return this.a.a();
    }

    public long b() {
        return this.a.b();
    }

    public Location c() {
        return this.a.c();
    }
}
