package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import o.C10977yY;
import o.FU;

@Deprecated
/* loaded from: classes2.dex */
public final class KU implements InterfaceC4824Yn {
    public static final InterfaceC8331nh2<InterfaceExecutorServiceC10119v11> c = C8818ph2.b(new InterfaceC8331nh2() { // from class: o.HU
        @Override // o.InterfaceC8331nh2
        public final Object get() {
            InterfaceExecutorServiceC10119v11 j;
            j = C3645Mk1.j(Executors.newSingleThreadExecutor());
            return j;
        }
    });
    public final InterfaceExecutorServiceC10119v11 a;
    public final FU.a b;

    public KU(Context context) {
        this((InterfaceExecutorServiceC10119v11) C9542sf.k(c.get()), new C10977yY.a(context));
    }

    public static Bitmap g(byte[] bArr) {
        boolean z = false;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray != null) {
            z = true;
        }
        C9542sf.b(z, "Could not decode image data");
        return decodeByteArray;
    }

    public static Bitmap h(FU fu, Uri uri) throws IOException {
        fu.a(new OU(uri));
        return g(NU.c(fu));
    }

    @Override // o.InterfaceC4824Yn
    public InterfaceFutureC8411o11<Bitmap> a(final Uri uri) {
        return this.a.submit(new Callable() { // from class: o.IU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap h;
                h = KU.h(KU.this.b.a(), uri);
                return h;
            }
        });
    }

    @Override // o.InterfaceC4824Yn
    public InterfaceFutureC8411o11<Bitmap> b(final byte[] bArr) {
        return this.a.submit(new Callable() { // from class: o.JU
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap g;
                g = KU.g(bArr);
                return g;
            }
        });
    }

    public KU(InterfaceExecutorServiceC10119v11 interfaceExecutorServiceC10119v11, FU.a aVar) {
        this.a = interfaceExecutorServiceC10119v11;
        this.b = aVar;
    }
}
