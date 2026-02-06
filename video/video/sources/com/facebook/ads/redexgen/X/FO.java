package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.facebook.ads.redexgen.X.C1673gi;
import com.facebook.ads.redexgen.X.FO;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class FO extends AbstractC1021Qq<FB> {
    public int A00;
    public final int A01;
    public final C7M A04;
    public final C1673gi A05;
    public final View$OnClickListenerC0871Kr A06;
    public final List<String> A08;
    public final Application.ActivityLifecycleCallbacks A02 = new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.ads.internal.view.rewardedvideo.EndCardV2ScreenshotRecyclerAdapter$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            C1673gi c1673gi;
            Handler handler;
            Runnable runnable;
            c1673gi = FO.this.A05;
            if (activity == c1673gi.A0E()) {
                handler = FO.this.A03;
                runnable = FO.this.A07;
                handler.removeCallbacks(runnable);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Handler handler;
            Runnable runnable;
            handler = FO.this.A03;
            runnable = FO.this.A07;
            handler.post(runnable);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    };
    public final Handler A03 = new Handler(Looper.getMainLooper());
    public final Runnable A07 = new RunnableC1538eX(this);

    public FO(C1673gi c1673gi, List<String> screenshotUrls, int i, C7M c7m, View$OnClickListenerC0871Kr view$OnClickListenerC0871Kr, int i2) {
        this.A08 = screenshotUrls;
        this.A01 = i;
        this.A05 = c1673gi;
        this.A04 = c7m;
        this.A06 = view$OnClickListenerC0871Kr;
        this.A00 = i2;
        this.A03.post(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().registerActivityLifecycleCallbacks(this.A02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A05 */
    public final FB A0F(ViewGroup viewGroup, int i) {
        F9 f9 = new F9(this.A05);
        if (C1123Up.A1D(this.A05)) {
            f9.setOnClickListener(new View$OnClickListenerC1539eY(this));
        }
        return new FB(f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    /* renamed from: A07 */
    public final void A0K(FB fb, int i) {
        int size = i % this.A08.size();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(400, -1);
        int i2 = this.A01;
        int actualPosition = this.A01;
        marginLayoutParams.setMargins(i2, 0, actualPosition, 0);
        fb.A0p().setLayoutParams(marginLayoutParams);
        fb.A0p().setUrl(this.A08.get(size));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    public final int A0B() {
        return this.A08.size() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1021Qq
    public final void A0L(C7M c7m) {
        super.A0L(c7m);
        this.A03.removeCallbacks(this.A07);
        if (Build.VERSION.SDK_INT >= 29 && this.A05.A0E() != null) {
            this.A05.A0E().unregisterActivityLifecycleCallbacks(this.A02);
        }
    }

    public final void A0O(int i) {
        this.A00 = i;
    }
}
