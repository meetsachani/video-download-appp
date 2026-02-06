package o;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.location.Location;
import android.net.Uri;
import o.AbstractC5209ax1;
import o.C4804Yi;

/* renamed from: o.Lh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3536Lh1 extends AbstractC5209ax1 {
    public static final ContentValues e = new ContentValues();
    public final b d;

    /* renamed from: o.Lh1$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC5209ax1.a<C3536Lh1, a> {
        public final b.a b;

        public a(ContentResolver contentResolver, Uri uri) {
            super(new C4804Yi.b());
            C10907yF1.m(contentResolver, "Content resolver can't be null.");
            C10907yF1.m(uri, "Collection Uri can't be null.");
            b.a aVar = (b.a) this.a;
            this.b = aVar;
            aVar.g(contentResolver).f(uri).h(C3536Lh1.e);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.Lh1$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a b(long j) {
            return super.b(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.Lh1$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a c(long j) {
            return super.c(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [o.Lh1$a, java.lang.Object] */
        @Override // o.AbstractC5209ax1.a
        public /* bridge */ /* synthetic */ a d(Location location) {
            return super.d(location);
        }

        @Override // o.AbstractC5209ax1.a
        /* renamed from: e */
        public C3536Lh1 a() {
            return new C3536Lh1(this.b.a());
        }

        public a f(ContentValues contentValues) {
            C10907yF1.m(contentValues, "Content values can't be null.");
            this.b.h(contentValues);
            return this;
        }
    }

    /* renamed from: o.Lh1$b */
    /* loaded from: classes.dex */
    public static abstract class b extends AbstractC5209ax1.b {

        /* renamed from: o.Lh1$b$a */
        /* loaded from: classes.dex */
        public static abstract class a extends AbstractC5209ax1.b.a<a> {
            @Override // o.AbstractC5209ax1.b.a
            /* renamed from: e */
            public abstract b a();

            public abstract a f(Uri uri);

            public abstract a g(ContentResolver contentResolver);

            public abstract a h(ContentValues contentValues);
        }

        public abstract Uri d();

        public abstract ContentResolver e();

        public abstract ContentValues f();
    }

    public C3536Lh1(b bVar) {
        super(bVar);
        this.d = bVar;
    }

    public Uri d() {
        return this.d.d();
    }

    public ContentResolver e() {
        return this.d.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3536Lh1)) {
            return false;
        }
        return this.d.equals(((C3536Lh1) obj).d);
    }

    public ContentValues f() {
        return this.d.f();
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        return this.d.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }
}
