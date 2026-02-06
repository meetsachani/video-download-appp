package o;

import android.location.Location;
import java.io.File;
import o.AbstractC5209ax1;
import o.C3733Ni;

/* renamed from: o.sp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9583sp0 extends AbstractC5209ax1 {
    public final b d;

    /* renamed from: o.sp0$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5209ax1.a<C9583sp0, a> {
        public final b.a b;

        public a(File file) {
            super(new C3733Ni.b());
            C10907yF1.m(file, "File can't be null.");
            b.a aVar = (b.a) this.a;
            this.b = aVar;
            aVar.f(file);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.sp0$a] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a b(long j) {
            return super.b(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.sp0$a] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a c(long j) {
            return super.c(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, o.sp0$a] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a d(Location location) {
            return super.d(location);
        }

        @Override // o.AbstractC5209ax1.a
        /* renamed from: e */
        public C9583sp0 a() {
            return new C9583sp0(this.b.a());
        }
    }

    /* renamed from: o.sp0$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC5209ax1.b {

        /* renamed from: o.sp0$b$a */
        /* loaded from: classes.dex */
        public static abstract class a extends AbstractC5209ax1.b.a<a> {
            @Override // o.AbstractC5209ax1.b.a
            /* renamed from: e */
            public abstract b a();

            public abstract a f(File file);
        }

        public abstract File d();
    }

    public C9583sp0(b bVar) {
        super(bVar);
        this.d = bVar;
    }

    public File d() {
        return this.d.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9583sp0)) {
            return false;
        }
        return this.d.equals(((C9583sp0) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
