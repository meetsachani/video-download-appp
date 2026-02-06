package o;

import java.io.IOException;
import o.NV0;

/* renamed from: o.iM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7019iM {
    public static final NV0.a a = NV0.a.a("ty", "d");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c2, code lost:
        if (r2.equals("gf") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC6776hM a(NV0 nv0, C10624x51 c10624x51) throws IOException {
        InterfaceC6776hM interfaceC6776hM;
        String str;
        nv0.f();
        char c = 2;
        int i = 2;
        while (true) {
            interfaceC6776hM = null;
            if (nv0.j()) {
                int s = nv0.s(a);
                if (s != 0) {
                    if (s != 1) {
                        nv0.t();
                        nv0.u();
                    } else {
                        i = nv0.m();
                    }
                } else {
                    str = nv0.o();
                    break;
                }
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 3239:
                if (str.equals("el")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3270:
                if (str.equals("fl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3295:
                break;
            case 3307:
                if (str.equals("gr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3308:
                if (str.equals("gs")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3488:
                if (str.equals("mm")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3633:
                if (str.equals("rc")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3634:
                if (str.equals("rd")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3646:
                if (str.equals("rp")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3669:
                if (str.equals("sh")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3679:
                if (str.equals("sr")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3681:
                if (str.equals("st")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 3705:
                if (str.equals("tm")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 3710:
                if (str.equals("tr")) {
                    c = C8206nB.d;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                interfaceC6776hM = C9918uC.a(nv0, c10624x51, i);
                break;
            case 1:
                interfaceC6776hM = U22.a(nv0, c10624x51);
                break;
            case 2:
                interfaceC6776hM = C10170vE0.a(nv0, c10624x51);
                break;
            case 3:
                interfaceC6776hM = W22.a(nv0, c10624x51);
                break;
            case 4:
                interfaceC6776hM = C11145zE0.a(nv0, c10624x51);
                break;
            case 5:
                interfaceC6776hM = C11260zi1.a(nv0);
                c10624x51.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                interfaceC6776hM = EP1.a(nv0, c10624x51);
                break;
            case 7:
                interfaceC6776hM = C8531oV1.a(nv0, c10624x51);
                break;
            case '\b':
                interfaceC6776hM = FR1.a(nv0, c10624x51);
                break;
            case '\t':
                interfaceC6776hM = C5720d32.a(nv0, c10624x51);
                break;
            case '\n':
                interfaceC6776hM = C10903yE1.a(nv0, c10624x51, i);
                break;
            case 11:
                interfaceC6776hM = C6205f32.a(nv0, c10624x51);
                break;
            case '\f':
                interfaceC6776hM = C6703h32.a(nv0, c10624x51);
                break;
            case '\r':
                interfaceC6776hM = G9.h(nv0, c10624x51);
                break;
            default:
                C7190j41.e("Unknown shape type " + str);
                break;
        }
        while (nv0.j()) {
            nv0.u();
        }
        nv0.i();
        return interfaceC6776hM;
    }
}
