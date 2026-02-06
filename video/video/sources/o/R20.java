package o;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.login.C2399p;
import o.C9159r41;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class R20 extends C9159r41 {
    @Nullable
    public Uri B1;

    /* loaded from: classes2.dex */
    public final class a extends C9159r41.c {
        public final /* synthetic */ R20 Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(R20 r20) {
            super(r20);
            C6562gT0.p(r20, "this$0");
            this.Y = r20;
        }

        @Override // o.C9159r41.c
        @NotNull
        public com.facebook.login.G b() {
            if (SQ.e(this)) {
                return null;
            }
            try {
                C2399p a = C2399p.t.a();
                a.D0(this.Y.getDefaultAudience());
                a.G0(com.facebook.login.v.DEVICE_AUTH);
                a.V0(this.Y.getDeviceRedirectUri());
                return a;
            } catch (Throwable th) {
                SQ.c(th, this);
                return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R20(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C6562gT0.p(context, "context");
        C6562gT0.p(attributeSet, "attrs");
    }

    @Nullable
    public final Uri getDeviceRedirectUri() {
        return this.B1;
    }

    @Override // o.C9159r41
    @NotNull
    public C9159r41.c getNewLoginClickListener() {
        return new a(this);
    }

    public final void setDeviceRedirectUri(@Nullable Uri uri) {
        this.B1 = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R20(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        C6562gT0.p(context, "context");
        C6562gT0.p(attributeSet, "attrs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R20(@NotNull Context context) {
        super(context);
        C6562gT0.p(context, "context");
    }
}
