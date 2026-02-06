package o;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.IOException;
import o.C11122z81;

/* loaded from: classes.dex */
public class D81 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r0.equals("s") == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C11122z81 a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        boolean z;
        nv0.f();
        C11122z81.a aVar = null;
        C10881y9 c10881y9 = null;
        C9663t9 c9663t9 = null;
        boolean z2 = false;
        while (nv0.j()) {
            String n = nv0.n();
            n.getClass();
            char c = 3;
            switch (n.hashCode()) {
                case 111:
                    if (n.equals(W12.e)) {
                        z = false;
                        break;
                    }
                    z = true;
                    break;
                case 3588:
                    if (n.equals("pt")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 104433:
                    if (n.equals("inv")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                case 3357091:
                    if (n.equals("mode")) {
                        z = true;
                        break;
                    }
                    z = true;
                    break;
                default:
                    z = true;
                    break;
            }
            switch (z) {
                case false:
                    c9663t9 = I9.h(nv0, c10624x51);
                    break;
                case true:
                    c10881y9 = I9.k(nv0, c10624x51);
                    break;
                case true:
                    z2 = nv0.k();
                    break;
                case true:
                    String o2 = nv0.o();
                    o2.getClass();
                    switch (o2.hashCode()) {
                        case 97:
                            if (o2.equals("a")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 105:
                            if (o2.equals("i")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 110:
                            if (o2.equals(GoogleApiAvailabilityLight.e)) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 115:
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            aVar = C11122z81.a.MASK_MODE_ADD;
                            continue;
                        case 1:
                            c10624x51.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = C11122z81.a.MASK_MODE_INTERSECT;
                            continue;
                        case 2:
                            aVar = C11122z81.a.MASK_MODE_NONE;
                            continue;
                        case 3:
                            aVar = C11122z81.a.MASK_MODE_SUBTRACT;
                            continue;
                        default:
                            C7190j41.e("Unknown mask mode " + n + ". Defaulting to Add.");
                            aVar = C11122z81.a.MASK_MODE_ADD;
                            continue;
                    }
                default:
                    nv0.u();
                    break;
            }
        }
        nv0.i();
        return new C11122z81(aVar, c10881y9, c9663t9, z2);
    }
}
