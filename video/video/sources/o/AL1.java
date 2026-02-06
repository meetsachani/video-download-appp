package o;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.util.Random;

/* loaded from: classes3.dex */
public class AL1 {
    public static int a;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ Activity X;

        public a(Activity activity) {
            this.X = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.h(Boolean.TRUE);
            AL1.e(this.X);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ Activity X;

        public b(Activity activity) {
            this.X = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.h(Boolean.TRUE);
            AL1.e(this.X);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ Activity X;

        public c(Activity activity) {
            this.X = activity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.h(Boolean.TRUE);
            AL1.e(this.X);
        }
    }

    public static String a() {
        String str = C2723Dd.T().get(a);
        if (a >= C2723Dd.T().size() - 1) {
            a = 0;
            return str;
        }
        a++;
        return str;
    }

    public static void b(Activity activity, LinearLayout linearLayout) {
        linearLayout.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.qureka_cust_banner_white, (ViewGroup) linearLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_banner_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_banner_des);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ad_call_to_action);
        TextView textView4 = (TextView) inflate.findViewById(R.id.ad_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_banner_icon);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.native_bg);
        if (C2723Dd.j().size() == 0) {
            textView.setText("🏏Cricket Genius Challenge! 🏏");
            textView2.setText("🎯 Only the fastest and most knowledgeable participants will rise to the top,");
            imageView.setBackgroundResource(R.drawable.ad_logo);
        } else {
            int nextInt = new Random().nextInt(C2723Dd.j().size());
            com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).a())).C1(imageView);
            textView.setText(C2723Dd.j().get(nextInt).d());
            textView2.setText(C2723Dd.j().get(nextInt).c());
        }
        try {
            Log.d("Check212", "GetQuiz_Banner_Ads: " + C2723Dd.Q());
            if (C2723Dd.Q()) {
                linearLayout2.setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                linearLayout2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
            textView.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView2.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView3.setTextColor(Color.parseColor(C2723Dd.R()));
            textView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView4.setTextColor(Color.parseColor(C2723Dd.R()));
            textView3.setText(C2723Dd.b0());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        textView3.setOnClickListener(new c(activity));
        linearLayout.removeAllViews();
        linearLayout.addView(inflate);
    }

    public static void c(Activity activity, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Bundle bundle = new Bundle();
            bundle.putBinder(C10229vT.d, null);
            intent.putExtras(bundle);
            intent.putExtra(C10229vT.k, activity.getResources().getColor(R.color.app_color));
            intent.putExtra(C10229vT.Q, true);
            intent.setPackage("com.android.chrome");
            intent.setData(Uri.parse(str));
            activity.startActivity(intent, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void d(Activity activity, FrameLayout frameLayout) {
        frameLayout.setVisibility(0);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.custom_quiz_small_native_layout, (ViewGroup) frameLayout, false);
        TextView textView = (TextView) inflate.findViewById(R.id.tv_text_ad_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_text_ad_desc);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ln_playnow);
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_top_ads);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_nats_round);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.iv_native_logo_des);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.native_bg);
        if (C2723Dd.j().size() == 0) {
            textView.setText("Fast Video Downloader");
            textView2.setText("Supports all formats – MP4, HD, 4K! Download videos with one tap from your favorite sites.");
            imageView.setBackgroundResource(R.drawable.ad_logo);
            imageView2.setImageResource(R.drawable.ad_banner);
        } else {
            int nextInt = new Random().nextInt(C2723Dd.j().size());
            if (C2723Dd.J()) {
                if (C2723Dd.U()) {
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView2);
                } else {
                    com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).b())).C1(imageView2);
                }
            } else {
                com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).b())).C1(imageView2);
            }
            com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).a())).C1(imageView);
            textView.setText(C2723Dd.j().get(nextInt).d());
            textView2.setText(C2723Dd.j().get(nextInt).c());
        }
        try {
            if (C2723Dd.Q()) {
                linearLayout.setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                linearLayout.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
            textView.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView2.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView4.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.R())));
            textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView3.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.R())));
            textView3.setText(C2723Dd.b0());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        textView3.setOnClickListener(new b(activity));
        frameLayout.removeAllViews();
        frameLayout.addView(inflate);
    }

    public static void e(Activity activity) {
        c(activity, C2723Dd.v0().get(new Random().nextInt(C2723Dd.v0().size())));
    }

    public static void f(Activity activity, LinearLayout linearLayout, boolean z) {
        View inflate;
        linearLayout.setVisibility(0);
        if (z) {
            inflate = LayoutInflater.from(activity).inflate(R.layout.quiz_ad_native, (ViewGroup) linearLayout, false);
        } else {
            inflate = LayoutInflater.from(activity).inflate(R.layout.custom_quiz_small_native_layout, (ViewGroup) linearLayout, false);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.tv_text_ad_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tv_text_ad_desc);
        TextView textView3 = (TextView) inflate.findViewById(R.id.ln_playnow);
        TextView textView4 = (TextView) inflate.findViewById(R.id.txt_top_ads);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.iv_nats_round);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.iv_native_logo_des);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.native_bg);
        if (C2723Dd.j().size() == 0) {
            textView.setText("Fast Video Downloader");
            textView2.setText("Supports all formats – MP4, HD, 4K! Download videos with one tap from your favorite sites.");
            imageView.setBackgroundResource(R.drawable.ad_logo);
            imageView2.setImageResource(R.drawable.ad_banner);
        } else {
            int nextInt = new Random().nextInt(C2723Dd.j().size());
            if (C2723Dd.J()) {
                if (C2723Dd.U()) {
                    com.bumptech.glide.a.D(activity).r(a()).C1(imageView2);
                } else {
                    com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).b())).C1(imageView2);
                }
            } else {
                com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).b())).C1(imageView2);
            }
            com.bumptech.glide.a.D(activity).p(Integer.valueOf(C2723Dd.j().get(nextInt).a())).C1(imageView);
            textView.setText(C2723Dd.j().get(nextInt).d());
            textView2.setText(C2723Dd.j().get(nextInt).c());
        }
        try {
            if (C2723Dd.Q()) {
                linearLayout2.setBackground(activity.getResources().getDrawable(R.drawable.native_border_bg));
            } else {
                linearLayout2.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.g())));
            }
            textView.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView2.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.M())));
            textView4.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView4.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.R())));
            textView3.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor(C2723Dd.N())));
            textView3.setTextColor(ColorStateList.valueOf(Color.parseColor(C2723Dd.R())));
            textView3.setText(C2723Dd.b0());
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        textView3.setOnClickListener(new a(activity));
        linearLayout.removeAllViews();
        linearLayout.addView(inflate);
    }
}
