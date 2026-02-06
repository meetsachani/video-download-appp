package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.common.b;
import com.facebook.internal.C2356a;
import com.facebook.internal.C2361f;
import com.facebook.share.b;

/* renamed from: o.p32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8664p32 extends AbstractC8907q32 {
    public C8664p32(final Context context) {
        super(context, null, 0, C2356a.q0, C2356a.s0);
    }

    @Override // o.AbstractC8907q32, com.facebook.AbstractC2410t
    public void c(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super.c(context, attrs, defStyleAttr, defStyleRes);
        setCompoundDrawablesWithIntrinsicBounds(C3220Ic.b(getContext(), b.g.I0), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultRequestCode() {
        return C2361f.c.Share.g();
    }

    @Override // com.facebook.AbstractC2410t
    public int getDefaultStyleResource() {
        return b.m.b6;
    }

    @Override // o.AbstractC8907q32
    public C10617x32 getDialog() {
        C10617x32 c10617x32;
        if (getFragment() != null) {
            c10617x32 = new C10617x32(getFragment(), getRequestCode());
        } else if (getNativeFragment() != null) {
            c10617x32 = new C10617x32(getNativeFragment(), getRequestCode());
        } else {
            c10617x32 = new C10617x32(getActivity(), getRequestCode());
        }
        c10617x32.t(getCallbackManager());
        return c10617x32;
    }

    public C8664p32(final Context context, final AttributeSet attrs) {
        super(context, attrs, 0, C2356a.q0, C2356a.s0);
    }

    public C8664p32(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr, C2356a.q0, C2356a.s0);
    }
}
