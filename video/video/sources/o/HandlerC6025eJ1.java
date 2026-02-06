package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: o.eJ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class HandlerC6025eJ1 extends Handler {
    public final InterfaceC6171ev1 a;

    public HandlerC6025eJ1(InterfaceC6171ev1 interfaceC6171ev1) {
        super(Looper.getMainLooper());
        this.a = interfaceC6171ev1;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
            return;
        }
        InterfaceC6171ev1 interfaceC6171ev1 = this.a;
        if (interfaceC6171ev1 != null) {
            interfaceC6171ev1.b((C5783dJ1) message.obj);
        }
    }
}
