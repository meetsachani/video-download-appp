package o;

import o.C10408wC0;

/* renamed from: o.yC0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C10894yC0 {
    public static void a(C10408wC0 content) {
        boolean z;
        boolean z2;
        com.facebook.internal.m0.s(content.e(), "message");
        int i = 0;
        if (content.f() != null) {
            z = true;
        } else {
            z = false;
        }
        if (content.a() != C10408wC0.a.ASKFOR && content.a() != C10408wC0.a.SEND) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(z ^ z2)) {
            if (content.g() != null) {
                i = 1;
            }
            if (content.h() != null) {
                i++;
            }
            if (content.d() != null) {
                i++;
            }
            if (i <= 1) {
                return;
            }
            throw new IllegalArgumentException("Parameters to, filters and suggestions are mutually exclusive");
        }
        throw new IllegalArgumentException("Object id should be provided if and only if action type is send or askfor");
    }
}
