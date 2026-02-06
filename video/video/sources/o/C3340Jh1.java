package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* renamed from: o.Jh1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3340Jh1 implements InterfaceC7595kk1<Uri, File> {
    public final Context a;

    public C3340Jh1(Context context) {
        this.a = context;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<File> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(uri), new b(this.a, uri));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        return C3829Oh1.d(uri);
    }

    /* renamed from: o.Jh1$a */
    /* loaded from: classes.dex */
    public static final class a implements InterfaceC7838lk1<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // o.InterfaceC7838lk1
        public InterfaceC7595kk1<Uri, File> e(C5650cm1 c5650cm1) {
            return new C3340Jh1(this.a);
        }

        @Override // o.InterfaceC7838lk1
        public void d() {
        }
    }

    /* renamed from: o.Jh1$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9990uU<File> {
        public static final String[] Z = {C7033iP1.m0};
        public final Context X;
        public final Uri Y;

        public b(Context context, Uri uri) {
            this.X = context;
            this.Y = uri;
        }

        @Override // o.InterfaceC9990uU
        public Class<File> a() {
            return File.class;
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super File> aVar) {
            Cursor query = this.X.getContentResolver().query(this.Y, Z, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow(C7033iP1.m0));
                    }
                    query.close();
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (TextUtils.isEmpty(str)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.Y));
                return;
            }
            aVar.f(new File(str));
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        @Override // o.InterfaceC9990uU
        public void b() {
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
        }
    }
}
