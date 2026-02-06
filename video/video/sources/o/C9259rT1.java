package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: o.rT1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C9259rT1 {
    public boolean a;
    public final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: o.rT1$a */
    /* loaded from: classes.dex */
    public static final class a implements Handler.Callback {
        public static final int X = 1;

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((InterfaceC5580cT1) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(InterfaceC5580cT1<?> interfaceC5580cT1, boolean z) {
        try {
            if (!this.a && !z) {
                this.a = true;
                interfaceC5580cT1.a();
                this.a = false;
            }
            this.b.obtainMessage(1, interfaceC5580cT1).sendToTarget();
        } catch (Throwable th) {
            throw th;
        }
    }
}
