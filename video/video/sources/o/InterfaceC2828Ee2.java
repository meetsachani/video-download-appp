package o;

/* renamed from: o.Ee2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2828Ee2 {
    default int a(CharSequence charSequence, int i) {
        return c(charSequence, i, 0, charSequence.length());
    }

    int b(char[] cArr, int i, int i2, int i3);

    default int c(CharSequence charSequence, int i, int i2, int i3) {
        return b(C6489gB.h(charSequence), i, i3, i3);
    }

    default InterfaceC2828Ee2 d(InterfaceC2828Ee2 interfaceC2828Ee2) {
        return C2937Fe2.c.a(this, interfaceC2828Ee2);
    }

    default int e(char[] cArr, int i) {
        return b(cArr, i, 0, cArr.length);
    }

    default int size() {
        return 0;
    }
}
