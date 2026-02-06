package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.InterfaceC9990uU;

/* renamed from: o.j21  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7182j21<T> implements InterfaceC9990uU<T> {
    public static final String Z0 = "LocalUriFetcher";
    public final boolean X;
    public final Uri Y;
    public T Y0;
    public final ContentResolver Z;

    public AbstractC7182j21(ContentResolver contentResolver, Uri uri) {
        this(contentResolver, uri, false);
    }

    @Override // o.InterfaceC9990uU
    public void b() {
        T t = this.Y0;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // o.InterfaceC9990uU
    public final void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super T> aVar) {
        try {
            T f = f(this.Y, this.Z);
            this.Y0 = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(Z0, 3)) {
                Log.d(Z0, "Failed to open Uri", e);
            }
            aVar.c(e);
        }
    }

    @Override // o.InterfaceC9990uU
    public GU e() {
        return GU.LOCAL;
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    public AssetFileDescriptor g(Uri uri) throws FileNotFoundException {
        if (this.X && C3829Oh1.d(uri) && C3829Oh1.c()) {
            return C3829Oh1.h(uri, this.Z);
        }
        return this.Z.openAssetFileDescriptor(uri, "r");
    }

    public AbstractC7182j21(ContentResolver contentResolver, Uri uri, boolean z) {
        this.Z = contentResolver;
        this.Y = uri;
        this.X = z;
    }

    @Override // o.InterfaceC9990uU
    public void cancel() {
    }
}
