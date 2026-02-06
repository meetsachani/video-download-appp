package o;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class JG1<Z> extends HT<Z> {
    public static final int Z0 = 1;
    public static final Handler a1 = new Handler(Looper.getMainLooper(), new a());
    public final ComponentCallbacks2C7772lS1 Y0;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((JG1) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public JG1(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, int i, int i2) {
        super(i, i2);
        this.Y0 = componentCallbacks2C7772lS1;
    }

    public static <Z> JG1<Z> b(ComponentCallbacks2C7772lS1 componentCallbacks2C7772lS1, int i, int i2) {
        return new JG1<>(componentCallbacks2C7772lS1, i, i2);
    }

    public void a() {
        this.Y0.z(this);
    }

    @Override // o.InterfaceC2856El2
    public void o(Z z, InterfaceC8136mt2<? super Z> interfaceC8136mt2) {
        InterfaceC5334bS1 j = j();
        if (j != null && j.g()) {
            a1.obtainMessage(1, this).sendToTarget();
        }
    }

    @Override // o.InterfaceC2856El2
    public void k(Drawable drawable) {
    }
}
