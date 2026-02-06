package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class R01 extends Fragment {
    public static final int s2 = 16711681;
    public static final int t2 = 16711682;
    public static final int u2 = 16711683;
    public final Handler h2 = new Handler();
    public final Runnable i2 = new a();
    public final AdapterView.OnItemClickListener j2 = new b();
    public ListAdapter k2;
    public ListView l2;
    public View m2;
    public TextView n2;
    public View o2;
    public View p2;
    public CharSequence q2;
    public boolean r2;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = R01.this.l2;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            R01.this.L2((ListView) adapterView, view, i, j);
        }
    }

    public final void G2() {
        if (this.l2 != null) {
            return;
        }
        View n0 = n0();
        if (n0 != null) {
            if (n0 instanceof ListView) {
                this.l2 = (ListView) n0;
            } else {
                TextView textView = (TextView) n0.findViewById(s2);
                this.n2 = textView;
                if (textView == null) {
                    this.m2 = n0.findViewById(16908292);
                } else {
                    textView.setVisibility(8);
                }
                this.o2 = n0.findViewById(t2);
                this.p2 = n0.findViewById(u2);
                View findViewById = n0.findViewById(16908298);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.l2 = listView;
                View view = this.m2;
                if (view != null) {
                    listView.setEmptyView(view);
                } else {
                    CharSequence charSequence = this.q2;
                    if (charSequence != null) {
                        this.n2.setText(charSequence);
                        this.l2.setEmptyView(this.n2);
                    }
                }
            }
            this.r2 = true;
            this.l2.setOnItemClickListener(this.j2);
            ListAdapter listAdapter = this.k2;
            if (listAdapter != null) {
                this.k2 = null;
                O2(listAdapter);
            } else if (this.o2 != null) {
                Q2(false, false);
            }
            this.h2.post(this.i2);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    public ListAdapter H2() {
        return this.k2;
    }

    public ListView I2() {
        G2();
        return this.l2;
    }

    public long J2() {
        G2();
        return this.l2.getSelectedItemId();
    }

    public int K2() {
        G2();
        return this.l2.getSelectedItemPosition();
    }

    public final ListAdapter M2() {
        ListAdapter H2 = H2();
        if (H2 != null) {
            return H2;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void N2(CharSequence charSequence) {
        G2();
        TextView textView = this.n2;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.q2 == null) {
                this.l2.setEmptyView(this.n2);
            }
            this.q2 = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void O2(ListAdapter listAdapter) {
        boolean z;
        boolean z2 = false;
        if (this.k2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.k2 = listAdapter;
        ListView listView = this.l2;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.r2 && !z) {
                if (Y1().getWindowToken() != null) {
                    z2 = true;
                }
                Q2(true, z2);
            }
        }
    }

    public void P2(boolean z) {
        Q2(z, true);
    }

    public final void Q2(boolean z, boolean z2) {
        G2();
        View view = this.o2;
        if (view != null) {
            if (this.r2 == z) {
                return;
            }
            this.r2 = z;
            if (z) {
                if (z2) {
                    view.startAnimation(AnimationUtils.loadAnimation(v(), 17432577));
                    this.p2.startAnimation(AnimationUtils.loadAnimation(v(), 17432576));
                } else {
                    view.clearAnimation();
                    this.p2.clearAnimation();
                }
                this.o2.setVisibility(8);
                this.p2.setVisibility(0);
                return;
            }
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(v(), 17432576));
                this.p2.startAnimation(AnimationUtils.loadAnimation(v(), 17432577));
            } else {
                view.clearAnimation();
                this.p2.clearAnimation();
            }
            this.o2.setVisibility(0);
            this.p2.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @Override // androidx.fragment.app.Fragment
    public View R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context U1 = U1();
        FrameLayout frameLayout = new FrameLayout(U1);
        LinearLayout linearLayout = new LinearLayout(U1);
        linearLayout.setId(t2);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(U1, null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(U1);
        frameLayout2.setId(u2);
        TextView textView = new TextView(U1);
        textView.setId(s2);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(U1);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void R2(boolean z) {
        Q2(z, false);
    }

    public void S2(int i) {
        G2();
        this.l2.setSelection(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void U0() {
        this.h2.removeCallbacks(this.i2);
        this.l2 = null;
        this.r2 = false;
        this.p2 = null;
        this.o2 = null;
        this.m2 = null;
        this.n2 = null;
        super.U0();
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(View view, Bundle bundle) {
        super.m1(view, bundle);
        G2();
    }

    public void L2(ListView listView, View view, int i, long j) {
    }
}
