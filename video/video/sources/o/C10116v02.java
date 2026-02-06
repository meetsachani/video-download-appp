package o;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2361f;
import com.facebook.share.b;

/* renamed from: o.v02  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10116v02 extends AbstractC8907q32 {
    public C10116v02(final Context context) {
        super(context, null, 0, C2356a.r0, C2356a.t0);
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultRequestCode() {
        return C2361f.c.Message.g();
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultStyleResource() {
        return b.m.a6;
    }

    @Override // o.AbstractC8907q32
    public C10617x32 getDialog() {
        C2843Ei1 c2843Ei1;
        if (getFragment() != null) {
            c2843Ei1 = new C2843Ei1(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            c2843Ei1 = new C2843Ei1(getNativeFragment(), getRequestCode());
        } else {
            c2843Ei1 = new C2843Ei1(getActivity(), getRequestCode());
        }
        c2843Ei1.t(getCallbackManager());
        return c2843Ei1;
    }

    public C10116v02(final Context context, final AttributeSet attrs) {
        super(context, attrs, 0, C2356a.r0, C2356a.t0);
    }

    public C10116v02(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr, C2356a.r0, C2356a.t0);
    }
}
