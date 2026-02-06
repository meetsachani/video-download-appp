package o;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.DownloadActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.Download.MyDownloadsActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.HowToUse.HowToUseActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.SettingActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer.VideoFolderActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WatchVideo.WatchActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.DirectChatActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.WhatsAppStatusActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import o.I7;

/* renamed from: o.v71  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10143v71 extends Fragment {
    public static String[] l2 = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static String[] m2 = {"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
    public C6186ez0 h2;
    public String i2 = "";
    public String j2 = "";
    public boolean k2 = false;

    /* renamed from: o.v71$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: o.v71$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0347a implements I7.f {
            public C0347a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), SettingActivity.class));
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(C10143v71.this.o(), new C0347a(), new boolean[0]);
        }
    }

    /* renamed from: o.v71$b */
    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Thread", "");
        }
    }

    /* renamed from: o.v71$c */
    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Pinterest", "");
        }
    }

    /* renamed from: o.v71$d */
    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {

        /* renamed from: o.v71$d$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), MyDownloadsActivity.class).putExtra("type", "AllVideo"));
            }
        }

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$e */
    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* renamed from: o.v71$e$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), DirectChatActivity.class).putExtra("type", "AllVideo"));
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$f */
    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {

        /* renamed from: o.v71$f$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), WatchActivity.class));
            }
        }

        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$g */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {

        /* renamed from: o.v71$g$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), HowToUseActivity.class));
            }
        }

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(C10143v71.this.o(), new a(), new boolean[0]);
        }
    }

    /* renamed from: o.v71$h */
    /* loaded from: classes3.dex */
    public class h implements I7.f {
        public h() {
        }

        @Override // o.I7.f
        public void a(boolean z) {
            C10143v71.this.A2(new Intent(C10143v71.this.o(), DownloadActivity.class).putExtra("type", C10143v71.this.i2).putExtra("link", C10143v71.this.j2));
        }
    }

    /* renamed from: o.v71$i */
    /* loaded from: classes3.dex */
    public class i implements I7.f {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public i(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // o.I7.f
        public void a(boolean z) {
            C10143v71.this.A2(new Intent(C10143v71.this.o(), DownloadActivity.class).putExtra("type", this.a).putExtra("link", this.b));
        }
    }

    /* renamed from: o.v71$j */
    /* loaded from: classes3.dex */
    public class j implements I7.f {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        @Override // o.I7.f
        public void a(boolean z) {
            C10143v71.this.A2(new Intent(C10143v71.this.o(), DownloadActivity.class).putExtra("type", this.a).putExtra("link", this.b));
        }
    }

    /* renamed from: o.v71$k */
    /* loaded from: classes3.dex */
    public class k implements View.OnClickListener {
        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.K2();
        }
    }

    /* renamed from: o.v71$l */
    /* loaded from: classes3.dex */
    public class l implements View.OnClickListener {

        /* renamed from: o.v71$l$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), VideoFolderActivity.class));
            }
        }

        public l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$m */
    /* loaded from: classes3.dex */
    public class m implements View.OnClickListener {

        /* renamed from: o.v71$m$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), WhatsAppStatusActivity.class).putExtra("name", "Whatsapp"));
            }
        }

        public m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$n */
    /* loaded from: classes3.dex */
    public class n implements View.OnClickListener {

        /* renamed from: o.v71$n$a */
        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                C10143v71.this.A2(new Intent(C10143v71.this.o(), WhatsAppStatusActivity.class).putExtra("name", "WA Business"));
            }
        }

        public n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71 c10143v71 = C10143v71.this;
            c10143v71.k2 = true;
            if (C5036aE2.f(c10143v71.o())) {
                I7.o(C10143v71.this.o(), new a(), new boolean[0]);
            }
        }
    }

    /* renamed from: o.v71$o */
    /* loaded from: classes3.dex */
    public class o implements View.OnClickListener {
        public o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Facebook", "");
        }
    }

    /* renamed from: o.v71$p */
    /* loaded from: classes3.dex */
    public class p implements View.OnClickListener {
        public p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Instagram", "");
        }
    }

    /* renamed from: o.v71$q */
    /* loaded from: classes3.dex */
    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Tiktok", "");
        }
    }

    /* renamed from: o.v71$r */
    /* loaded from: classes3.dex */
    public class r implements View.OnClickListener {
        public r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C10143v71.this.J2("Linkedin", "");
        }
    }

    public static /* synthetic */ boolean G2(C10143v71 c10143v71, TextView textView, int i2, KeyEvent keyEvent) {
        c10143v71.getClass();
        if (i2 != 5 && i2 != 6 && i2 != 2 && i2 != 3) {
            return false;
        }
        String trim = c10143v71.h2.b.getText().toString().trim();
        if (!trim.isEmpty()) {
            if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
                Toast.makeText(c10143v71.o(), "Invalid URL", 0).show();
                return true;
            }
            c10143v71.K2();
            return true;
        }
        return true;
    }

    public final void J2(String str, String str2) {
        this.i2 = str;
        this.j2 = str2;
        this.k2 = true;
        if (Build.VERSION.SDK_INT >= 33) {
            if (o().checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && o().checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) {
                if (!this.h2.b.getText().toString().isEmpty()) {
                    this.h2.b.setText("");
                }
                I7.o(o(), new i(str, str2), new boolean[0]);
                return;
            }
            R1(m2, 1001);
        } else if (o().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && o().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            if (!this.h2.b.getText().toString().isEmpty()) {
                this.h2.b.setText("");
            }
            I7.o(o(), new j(str, str2), new boolean[0]);
        } else {
            R1(l2, 1002);
        }
    }

    public final void K2() {
        String obj = this.h2.b.getText().toString();
        if (!obj.isEmpty()) {
            if (C11203zS2.d(obj)) {
                J2("Facebook", obj);
                return;
            } else if (C11203zS2.e(obj)) {
                J2("Instagram", obj);
                return;
            } else if (C11203zS2.k(obj)) {
                J2("Twitter", obj);
                return;
            } else if (C11203zS2.i(obj)) {
                J2("Thread", obj);
                return;
            } else if (C11203zS2.f(obj)) {
                J2("Linkedin", obj);
                return;
            } else if (C11203zS2.g(obj)) {
                J2("Pinterest", obj);
                return;
            } else if (C11203zS2.h(obj)) {
                J2("Snack", obj);
                return;
            } else if (C11203zS2.j(obj)) {
                J2("Tiktok", obj);
                return;
            } else {
                this.h2.b.setError("Url is not valid or unsupported site");
                return;
            }
        }
        this.h2.b.setError("Url is empty");
    }

    @Override // androidx.fragment.app.Fragment
    public View R0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C6186ez0 d2 = C6186ez0.d(layoutInflater, viewGroup, false);
        this.h2 = d2;
        LinearLayout linearLayout = (LinearLayout) this.h2.getRoot().findViewById(R.id.llnative_full);
        C11284zo1.c(o(), linearLayout, (LinearLayout) d2.getRoot().findViewById(R.id.llline_full), Boolean.TRUE);
        this.h2.g.setOnClickListener(new a());
        this.h2.i.setOnClickListener(new k());
        this.h2.b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.u71
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                return C10143v71.G2(C10143v71.this, textView, i2, keyEvent);
            }
        });
        this.h2.f.setOnClickListener(new l());
        this.h2.q.setOnClickListener(new m());
        this.h2.p.setOnClickListener(new n());
        this.h2.j.setOnClickListener(new o());
        this.h2.k.setOnClickListener(new p());
        this.h2.f734o.setOnClickListener(new q());
        this.h2.l.setOnClickListener(new r());
        this.h2.n.setOnClickListener(new b());
        this.h2.m.setOnClickListener(new c());
        this.h2.e.setOnClickListener(new d());
        this.h2.d.setOnClickListener(new e());
        this.h2.h.setOnClickListener(new f());
        this.h2.c.setOnClickListener(new g());
        return this.h2.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void h1(int i2, @InterfaceC5670cr1 String[] strArr, @InterfaceC5670cr1 int[] iArr) {
        super.h1(i2, strArr, iArr);
        if (i2 == 1001) {
            if (iArr.length > 0 && iArr[0] == 0) {
                if (this.k2) {
                    if (!this.h2.b.getText().toString().isEmpty()) {
                        this.h2.b.setText("");
                    }
                    I7.o(o(), new h(), new boolean[0]);
                }
            } else {
                Toast.makeText(o(), "Media permission denied!", 0).show();
            }
        }
        if (i2 == 1002) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(o(), "Storage permission denied!", 0).show();
            }
        }
    }
}
