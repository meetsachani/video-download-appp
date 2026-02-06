package o;

import android.os.Build;
import android.view.ScrollFeedbackProvider;
import android.view.View;

/* loaded from: classes.dex */
public class UY1 {
    public final d a;

    /* loaded from: classes.dex */
    public static class b implements d {
        public final ScrollFeedbackProvider a;

        public b(View view) {
            this.a = ScrollFeedbackProvider.createProvider(view);
        }

        @Override // o.UY1.d
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
            this.a.onScrollLimit(i, i2, i3, z);
        }

        @Override // o.UY1.d
        public void onScrollProgress(int i, int i2, int i3, int i4) {
            this.a.onScrollProgress(i, i2, i3, i4);
        }

        @Override // o.UY1.d
        public void onSnapToItem(int i, int i2, int i3) {
            this.a.onSnapToItem(i, i2, i3);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void onScrollLimit(int i, int i2, int i3, boolean z);

        void onScrollProgress(int i, int i2, int i3, int i4);

        void onSnapToItem(int i, int i2, int i3);
    }

    public UY1(View view) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new b(view);
        } else {
            this.a = new c();
        }
    }

    public static UY1 a(View view) {
        return new UY1(view);
    }

    public void b(int i, int i2, int i3, boolean z) {
        this.a.onScrollLimit(i, i2, i3, z);
    }

    public void c(int i, int i2, int i3, int i4) {
        this.a.onScrollProgress(i, i2, i3, i4);
    }

    public void d(int i, int i2, int i3) {
        this.a.onSnapToItem(i, i2, i3);
    }

    /* loaded from: classes.dex */
    public static class c implements d {
        public c() {
        }

        @Override // o.UY1.d
        public void onSnapToItem(int i, int i2, int i3) {
        }

        @Override // o.UY1.d
        public void onScrollLimit(int i, int i2, int i3, boolean z) {
        }

        @Override // o.UY1.d
        public void onScrollProgress(int i, int i2, int i3, int i4) {
        }
    }
}
