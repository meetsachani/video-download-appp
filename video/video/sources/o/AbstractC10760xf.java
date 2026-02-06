package o;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import o.InterfaceC9990uU;

/* renamed from: o.xf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10760xf<T> implements InterfaceC9990uU<T> {
    public static final String Y0 = "AssetPathFetcher";
    public final String X;
    public final AssetManager Y;
    public T Z;

    public AbstractC10760xf(AssetManager assetManager, String str) {
        this.Y = assetManager;
        this.X = str;
    }

    @Override // o.InterfaceC9990uU
    public void b() {
        T t = this.Z;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // o.InterfaceC9990uU
    public void d(EnumC10672xH1 enumC10672xH1, InterfaceC9990uU.a<? super T> aVar) {
        try {
            T f = f(this.Y, this.X);
            this.Z = f;
            aVar.f(f);
        } catch (IOException e) {
            if (Log.isLoggable(Y0, 3)) {
                Log.d(Y0, "Failed to load data from asset manager", e);
            }
            aVar.c(e);
        }
    }

    @Override // o.InterfaceC9990uU
    public GU e() {
        return GU.LOCAL;
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;

    @Override // o.InterfaceC9990uU
    public void cancel() {
    }
}
