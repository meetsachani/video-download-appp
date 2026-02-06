package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: o.h21  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6698h21 extends AbstractC9882u3 {
    public static final C6698h21 c = new C6698h21();

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[Catch: UnknownHostException -> 0x0060, TRY_LEAVE, TryCatch #0 {UnknownHostException -> 0x0060, blocks: (B:5:0x0004, B:25:0x003f, B:27:0x0048, B:28:0x004d, B:29:0x004e, B:31:0x0057, B:12:0x001a, B:15:0x0024, B:18:0x002e), top: B:34:0x0004 }] */
    @Override // o.InterfaceC10759xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String lookup(String str) {
        char c2;
        if (str == null) {
            return null;
        }
        try {
            int hashCode = str.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3373707) {
                    if (hashCode == 1339224004 && str.equals(C10703xP0.b)) {
                        c2 = 1;
                        if (c2 == 0) {
                            if (c2 != 1) {
                                if (c2 == 2) {
                                    return InetAddress.getLocalHost().getHostAddress();
                                }
                                throw new IllegalArgumentException(str);
                            }
                            return InetAddress.getLocalHost().getCanonicalHostName();
                        }
                        return InetAddress.getLocalHost().getHostName();
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                } else {
                    if (str.equals("name")) {
                        c2 = 0;
                        if (c2 == 0) {
                        }
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                }
            } else {
                if (str.equals("address")) {
                    c2 = 2;
                    if (c2 == 0) {
                    }
                }
                c2 = 65535;
                if (c2 == 0) {
                }
            }
        } catch (UnknownHostException unused) {
            return null;
        }
    }
}
