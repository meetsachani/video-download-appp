package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.1J  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C1J extends C7M {
    public static String[] A00 = {"4mrgyhu5NuMSfoRJ7wvth", "0QrbVGKHuGc2eSGsbm7N10peHve4GVgP", "Meba3O6SWeMBrZzPyfP10SBJe7jX", "3Oa5wanHMWuCrkjHvXNfwyLB0ZtCKHr4", "YOQh7xYBrfW2123ECT3lDkRgUFpenV07", "JuO7BKBrPjkMVs4", "5m", "UWhmaXdvjdchgK72Wd2HML9QO634NCpp"};

    public C1J(C1673gi c1673gi) {
        super(c1673gi);
        setCarouselLayoutManager(c1673gi);
    }

    public AbstractC0744Ft getFullscreenCarouselRecyclerViewAdapter() {
        getAdapter();
        if (0 != 0) {
            getAdapter();
            return null;
        } else if (A00[6].length() != 2) {
            throw new RuntimeException();
        } else {
            A00[2] = "XAsjP5XwQSgGjSaOGRXjEIyXW47w";
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public C1743hr getLayoutManager() {
        return (C1743hr) super.getLayoutManager();
    }

    public R7 getOnScrollListener() {
        return new PY(this);
    }

    private void setCarouselLayoutManager(C1673gi c1673gi) {
        C1743hr c1743hr = new C1743hr(c1673gi, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            c1743hr.A1T(true);
        }
        super.setLayoutManager(c1743hr);
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public void setLayoutManager(R2 r2) {
    }
}
