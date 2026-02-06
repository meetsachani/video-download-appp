package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import o.InterfaceC9990uU;

/* renamed from: o.po2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8846po2 implements InterfaceC9990uU<InputStream> {
    public static final String Y0 = "MediaStoreThumbFetcher";
    public final Uri X;
    public final C10310vo2 Y;
    public InputStream Z;

    /* renamed from: o.po2$a */
    /* loaded from: classes.dex */
    public static class a implements InterfaceC9824to2 {
        public static final String[] b = {C7033iP1.m0};
        public static final String c = "kind = 1 AND image_id = ?";
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // o.InterfaceC9824to2
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, b, c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: o.po2$b */
    /* loaded from: classes.dex */
    public static class b implements InterfaceC9824to2 {
        public static final String[] b = {C7033iP1.m0};
        public static final String c = "kind = 1 AND video_id = ?";
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // o.InterfaceC9824to2
        public Cursor a(Uri uri) {
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, b, c, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public C8846po2(Uri uri, C10310vo2 c10310vo2) {
        this.X = uri;
        this.Y = c10310vo2;
    }

    public static C8846po2 c(Context context, Uri uri, InterfaceC9824to2 interfaceC9824to2) {
        return new C8846po2(uri, new C10310vo2(com.bumptech.glide.a.e(context).n().g(), interfaceC9824to2, com.bumptech.glide.a.e(context).g(), context.getContentResolver()));
    }

    public static C8846po2 f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static C8846po2 g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    @Override // o.InterfaceC9990uU
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // o.InterfaceC9990uU
    public void b() {
        InputStream inputStream = this.Z;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // o.InterfaceC9990uU
    public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.Z = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(Y0, 3)) {
                Log.d(Y0, "Failed to find thumbnail file", e);
            }
            aVar.c(e);
        }
    }

    @Override // o.InterfaceC9990uU
    public GU e() {
        return GU.LOCAL;
    }

    public final InputStream h() throws FileNotFoundException {
        int i;
        InputStream d = this.Y.d(this.X);
        if (d != null) {
            i = this.Y.a(this.X);
        } else {
            i = -1;
        }
        if (i != -1) {
            return new C2943Fg0(d, i);
        }
        return d;
    }

    @Override // o.InterfaceC9990uU
    public void cancel() {
    }
}
