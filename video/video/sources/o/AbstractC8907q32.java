package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.facebook.AbstractC2410t;
import com.facebook.InterfaceC2407p;
import com.facebook.InterfaceC2411u;
import com.facebook.share.e;

/* renamed from: o.q32  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8907q32 extends AbstractC2410t {
    public AbstractC9885u32 h1;
    public int i1;
    public boolean j1;
    public InterfaceC2407p k1;

    /* renamed from: o.q32$a */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            if (!SQ.e(this)) {
                try {
                    AbstractC8907q32.this.b(v);
                    AbstractC8907q32.this.getDialog().f(AbstractC8907q32.this.getShareContent());
                } catch (Throwable th) {
                    SQ.c(th, this);
                }
            }
        }
    }

    public AbstractC8907q32(final Context context, final AttributeSet attrs, final int defStyleAttr, final String analyticsButtonCreatedEventName, final String analyticsButtonTappedEventName) {
        super(context, attrs, defStyleAttr, 0, analyticsButtonCreatedEventName, analyticsButtonTappedEventName);
        int defaultRequestCode;
        this.i1 = 0;
        this.j1 = false;
        if (isInEditMode()) {
            defaultRequestCode = 0;
        } else {
            defaultRequestCode = getDefaultRequestCode();
        }
        this.i1 = defaultRequestCode;
        o(false);
    }

    @Override // com.facebook.AbstractC2410t
    public void c(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super.c(context, attrs, defStyleAttr, defStyleRes);
        setInternalOnClickListener(getShareOnClickListener());
    }

    public InterfaceC2407p getCallbackManager() {
        return this.k1;
    }

    public abstract C10617x32 getDialog();

    @Override // com.facebook.AbstractC2410t
    public int getRequestCode() {
        return this.i1;
    }

    public AbstractC9885u32 getShareContent() {
        return this.h1;
    }

    public View.OnClickListener getShareOnClickListener() {
        return new a();
    }

    public boolean n() {
        return getDialog().g(getShareContent());
    }

    public final void o(boolean enabled) {
        setEnabled(enabled);
        this.j1 = false;
    }

    public final void p(InterfaceC2407p callbackManager) {
        InterfaceC2407p interfaceC2407p = this.k1;
        if (interfaceC2407p == null) {
            this.k1 = callbackManager;
        } else if (interfaceC2407p != callbackManager) {
            Log.w(AbstractC8907q32.class.toString(), "You're registering a callback on a Facebook Share Button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public void q(final InterfaceC2407p callbackManager, final InterfaceC2411u<e.a> callback) {
        p(callbackManager);
        D32.D(getRequestCode(), callbackManager, callback);
    }

    public void r(final InterfaceC2407p callbackManager, final InterfaceC2411u<e.a> callback, final int requestCode) {
        setRequestCode(requestCode);
        q(callbackManager, callback);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        this.j1 = true;
    }

    public void setRequestCode(final int requestCode) {
        if (!com.facebook.M.L(requestCode)) {
            this.i1 = requestCode;
            return;
        }
        throw new IllegalArgumentException("Request code " + requestCode + " cannot be within the range reserved by the Facebook SDK.");
    }

    public void setShareContent(final AbstractC9885u32 shareContent) {
        this.h1 = shareContent;
        if (!this.j1) {
            o(n());
        }
    }
}
