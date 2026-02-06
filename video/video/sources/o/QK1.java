package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o.InterfaceC7595kk1;
import o.InterfaceC9990uU;

/* loaded from: classes.dex */
public final class QK1<DataT> implements InterfaceC7595kk1<Uri, DataT> {
    public final Context a;
    public final InterfaceC7595kk1<File, DataT> b;
    public final InterfaceC7595kk1<Uri, DataT> c;
    public final Class<DataT> d;

    /* loaded from: classes.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* loaded from: classes.dex */
    public static final class d<DataT> implements InterfaceC9990uU<DataT> {
        public static final String[] f1 = {C7033iP1.m0};
        public final Context X;
        public final InterfaceC7595kk1<File, DataT> Y;
        public final Uri Y0;
        public final InterfaceC7595kk1<Uri, DataT> Z;
        public final int Z0;
        public final int a1;
        public final C5448bw1 b1;
        public final Class<DataT> c1;
        public volatile boolean d1;
        public volatile InterfaceC9990uU<DataT> e1;

        public d(Context context, InterfaceC7595kk1<File, DataT> interfaceC7595kk1, InterfaceC7595kk1<Uri, DataT> interfaceC7595kk12, Uri uri, int i, int i2, C5448bw1 c5448bw1, Class<DataT> cls) {
            this.X = context.getApplicationContext();
            this.Y = interfaceC7595kk1;
            this.Z = interfaceC7595kk12;
            this.Y0 = uri;
            this.Z0 = i;
            this.a1 = i2;
            this.b1 = c5448bw1;
            this.c1 = cls;
        }

        @Override // o.InterfaceC9990uU
        public Class<DataT> a() {
            return this.c1;
        }

        @Override // o.InterfaceC9990uU
        public void b() {
            InterfaceC9990uU<DataT> interfaceC9990uU = this.e1;
            if (interfaceC9990uU != null) {
                interfaceC9990uU.b();
            }
        }

        public final InterfaceC7595kk1.a<DataT> c() throws FileNotFoundException {
            boolean isExternalStorageLegacy;
            Uri uri;
            isExternalStorageLegacy = Environment.isExternalStorageLegacy();
            if (isExternalStorageLegacy) {
                return this.Y.b(h(this.Y0), this.Z0, this.a1, this.b1);
            }
            if (C3829Oh1.a(this.Y0)) {
                return this.Z.b(this.Y0, this.Z0, this.a1, this.b1);
            }
            if (g()) {
                uri = MediaStore.setRequireOriginal(this.Y0);
            } else {
                uri = this.Y0;
            }
            return this.Z.b(uri, this.Z0, this.a1, this.b1);
        }

        @Override // o.InterfaceC9990uU
        public void cancel() {
            this.d1 = true;
            InterfaceC9990uU<DataT> interfaceC9990uU = this.e1;
            if (interfaceC9990uU != null) {
                interfaceC9990uU.cancel();
            }
        }

        @Override // o.InterfaceC9990uU
        public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super DataT> aVar) {
            try {
                InterfaceC9990uU<DataT> f = f();
                if (f == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.Y0));
                    return;
                }
                this.e1 = f;
                if (this.d1) {
                    cancel();
                } else {
                    f.d(enumC10672xH1, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }

        @Override // o.InterfaceC9990uU
        public GU e() {
            return GU.LOCAL;
        }

        public final InterfaceC9990uU<DataT> f() throws FileNotFoundException {
            InterfaceC7595kk1.a<DataT> c = c();
            if (c != null) {
                return c.c;
            }
            return null;
        }

        public final boolean g() {
            if (this.X.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return true;
            }
            return false;
        }

        public final File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.X.getContentResolver().query(uri, f1, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow(C7033iP1.m0));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public QK1(Context context, InterfaceC7595kk1<File, DataT> interfaceC7595kk1, InterfaceC7595kk1<Uri, DataT> interfaceC7595kk12, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = interfaceC7595kk1;
        this.c = interfaceC7595kk12;
        this.d = cls;
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: c */
    public InterfaceC7595kk1.a<DataT> b(Uri uri, int i, int i2, C5448bw1 c5448bw1) {
        return new InterfaceC7595kk1.a<>(new C7874lt1(uri), new d(this.a, this.b, this.c, uri, i, i2, c5448bw1, this.d));
    }

    @Override // o.InterfaceC7595kk1
    /* renamed from: d */
    public boolean a(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29 && C3829Oh1.d(uri)) {
            return true;
        }
        return false;
    }

    /* loaded from: classes.dex */
    public static abstract class a<DataT> implements InterfaceC7838lk1<Uri, DataT> {
        public final Context a;
        public final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // o.InterfaceC7838lk1
        public final InterfaceC7595kk1<Uri, DataT> e(C5650cm1 c5650cm1) {
            return new QK1(this.a, c5650cm1.d(File.class, this.b), c5650cm1.d(Uri.class, this.b), this.b);
        }

        @Override // o.InterfaceC7838lk1
        public final void d() {
        }
    }
}
