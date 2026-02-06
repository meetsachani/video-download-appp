package o;

import android.location.Location;
import android.os.ParcelFileDescriptor;
import o.AbstractC5209ax1;
import o.C3635Mi;

/* renamed from: o.dp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5903dp0 extends AbstractC5209ax1 {
    public final b d;

    /* renamed from: o.dp0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5209ax1.a<C5903dp0, a> {
        public final b.a b;

        public a(ParcelFileDescriptor parcelFileDescriptor) {
            super(new C3635Mi.b());
            C10907yF1.m(parcelFileDescriptor, "File descriptor can't be null.");
            b.a aVar = (b.a) this.a;
            this.b = aVar;
            aVar.f(parcelFileDescriptor);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.dp0$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a b(long j) {
            return super.b(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.dp0$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a c(long j) {
            return super.c(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.dp0$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a d(Location location) {
            return super.d(location);
        }

        @Override // o.AbstractC5209ax1.a
        /* renamed from: e */
        public C5903dp0 a() {
            return new C5903dp0(this.b.a());
        }
    }

    /* renamed from: o.dp0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC5209ax1.b {

        /* renamed from: o.dp0$b$a */
        /* loaded from: classes.dex */
        public static abstract class a extends AbstractC5209ax1.b.a<a> {
            @Override // o.AbstractC5209ax1.b.a
            /* renamed from: e */
            public abstract b a();

            public abstract a f(ParcelFileDescriptor parcelFileDescriptor);
        }

        public abstract ParcelFileDescriptor d();
    }

    public C5903dp0(b bVar) {
        super(bVar);
        this.d = bVar;
    }

    public ParcelFileDescriptor d() {
        return this.d.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5903dp0)) {
            return false;
        }
        return this.d.equals(((C5903dp0) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }
}
