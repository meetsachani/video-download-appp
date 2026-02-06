package o;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* renamed from: o.gQ0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6550gQ0 {
    public final c a;

    /* renamed from: o.gQ0$c */
    /* loaded from: classes.dex */
    public interface c {
        Object a();

        Uri b();

        Uri c();

        void d();

        void e();

        ClipDescription getDescription();
    }

    public C6550gQ0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.a = new a(uri, clipDescription, uri2);
        } else {
            this.a = new b(uri, clipDescription, uri2);
        }
    }

    public static C6550gQ0 g(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 25) {
            return null;
        }
        return new C6550gQ0(new a(obj));
    }

    public Uri a() {
        return this.a.c();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.b();
    }

    public void d() {
        this.a.e();
    }

    public void e() {
        this.a.d();
    }

    public Object f() {
        return this.a.a();
    }

    /* renamed from: o.gQ0$a */
    /* loaded from: classes.dex */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // o.C6550gQ0.c
        public Object a() {
            return this.a;
        }

        @Override // o.C6550gQ0.c
        public Uri b() {
            return this.a.getLinkUri();
        }

        @Override // o.C6550gQ0.c
        public Uri c() {
            return this.a.getContentUri();
        }

        @Override // o.C6550gQ0.c
        public void d() {
            this.a.requestPermission();
        }

        @Override // o.C6550gQ0.c
        public void e() {
            this.a.releasePermission();
        }

        @Override // o.C6550gQ0.c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public C6550gQ0(c cVar) {
        this.a = cVar;
    }

    /* renamed from: o.gQ0$b */
    /* loaded from: classes.dex */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // o.C6550gQ0.c
        public Object a() {
            return null;
        }

        @Override // o.C6550gQ0.c
        public Uri b() {
            return this.c;
        }

        @Override // o.C6550gQ0.c
        public Uri c() {
            return this.a;
        }

        @Override // o.C6550gQ0.c
        public ClipDescription getDescription() {
            return this.b;
        }

        @Override // o.C6550gQ0.c
        public void d() {
        }

        @Override // o.C6550gQ0.c
        public void e() {
        }
    }
}
