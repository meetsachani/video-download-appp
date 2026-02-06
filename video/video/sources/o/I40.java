package o;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes4.dex */
public final class I40 extends AbstractC9882u3 {
    public static final I40 c = new I40();

    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c A[Catch: UnknownHostException -> 0x0071, TRY_LEAVE, TryCatch #0 {UnknownHostException -> 0x0071, blocks: (B:9:0x0021, B:29:0x005d, B:31:0x0062, B:33:0x0067, B:35:0x006c, B:16:0x0039, B:19:0x0043, B:22:0x004c), top: B:38:0x0021 }] */
    @Override // o.InterfaceC10759xe2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String lookup(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.trim().split("\\|");
        int length = split.length;
        char c2 = 0;
        String trim = split[0].trim();
        if (length >= 2) {
            str = split[1].trim();
        }
        try {
            InetAddress byName = InetAddress.getByName(str);
            int hashCode = trim.hashCode();
            if (hashCode != -1147692044) {
                if (hashCode != 3373707) {
                    if (hashCode == 1339224004 && trim.equals(C10703xP0.b)) {
                        c2 = 1;
                        if (c2 == 0) {
                            if (c2 != 1) {
                                if (c2 != 2) {
                                    return byName.getHostAddress();
                                }
                                return byName.getHostAddress();
                            }
                            return byName.getCanonicalHostName();
                        }
                        return byName.getHostName();
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                } else {
                    if (trim.equals("name")) {
                        if (c2 == 0) {
                        }
                    }
                    c2 = 65535;
                    if (c2 == 0) {
                    }
                }
            } else {
                if (trim.equals("address")) {
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
