package o;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.WhatsAppStatusActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.util.ArrayList;
import o.C9254rS0;
import o.P5;

/* renamed from: o.Uc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4395Uc2 extends Fragment {
    public KK2 h2;
    public ArrayList<JK2> i2;
    public SwipeRefreshLayout j2;
    public RecyclerView k2;
    public WhatsAppStatusActivity l2;
    public LinearLayout m2;
    public final X5<C9254rS0> n2 = X(new P5.n(), new H5() { // from class: o.Tc2
        @Override // o.H5
        public final void a(Object obj) {
            C4395Uc2.G2(C4395Uc2.this, (G5) obj);
        }
    });

    /* renamed from: o.Uc2$a */
    /* loaded from: classes3.dex */
    public class a implements SwipeRefreshLayout.j {
        public a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            C4395Uc2.this.j2.setRefreshing(false);
        }
    }

    /* renamed from: o.Uc2$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4395Uc2.this.L2();
        }
    }

    /* renamed from: o.Uc2$d */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4395Uc2.this.L2();
        }
    }

    public static /* synthetic */ void G2(C4395Uc2 c4395Uc2, G5 g5) {
        c4395Uc2.getClass();
        if (g5.b() == -1) {
            Toast.makeText(c4395Uc2.o(), "succesfully", 0).show();
            c4395Uc2.o().runOnUiThread(new d());
        }
    }

    private void J2(View view) {
        this.j2 = (SwipeRefreshLayout) view.findViewById(R.id.swiperefresh);
        this.k2 = (RecyclerView) view.findViewById(R.id.rv_fileList);
        this.m2 = (LinearLayout) view.findViewById(R.id.no_data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L2() {
        this.k2.setLayoutManager(new GridLayoutManager(o(), 2));
        this.j2.setOnRefreshListener(new a());
        I2();
    }

    public final void I2() {
        File[] listFiles;
        this.k2.setLayoutManager(new GridLayoutManager(o(), 2));
        this.i2 = new ArrayList<>();
        File file = C5036aE2.e;
        if (!file.exists()) {
            this.m2.setVisibility(0);
            this.j2.setVisibility(8);
            return;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                String name = file2.getName();
                if (name.substring(0, Math.min(8, name.length())).equals("Whatsapp")) {
                    String lowerCase = file2.getName().toLowerCase();
                    if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(C4940Zp0.Z) || lowerCase.endsWith(".mkv") || lowerCase.endsWith(C4940Zp0.X) || lowerCase.endsWith(C4940Zp0.Y) || lowerCase.endsWith(C5179aq.s1)) {
                        this.i2.add(new JK2(Uri.fromFile(new File(file2.getPath())), file2.getPath(), file2.getName()));
                    }
                }
            }
        }
        if (this.i2.isEmpty()) {
            this.m2.setVisibility(0);
            this.j2.setVisibility(8);
            return;
        }
        this.m2.setVisibility(8);
        this.j2.setVisibility(0);
        KK2 kk2 = new KK2(o(), this.i2, "", new b());
        this.h2 = kk2;
        this.k2.setAdapter(kk2);
    }

    public void K2(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = o().getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(o(), "Successfully Delete Video", 0).show();
            o().runOnUiThread(new c());
        } catch (SecurityException e) {
            Log.d("uri:==", "DeleteVideo121: ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Log.d("uri:==", "SDK_INT: ");
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createDeleteRequest(contentResolver, arrayList);
            } else if (i >= 29) {
                Log.d("uri:==", "VERSION_CODES: ");
                if (C6641go1.a(e)) {
                    userAction = C6884ho1.a(e).getUserAction();
                    pendingIntent = userAction.getActionIntent();
                }
            }
            if (pendingIntent != null) {
                this.n2.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(o(), "Successfully Delete Video", 0).show();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        this.l2 = (WhatsAppStatusActivity) o();
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC11300zs1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_status_saved, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void i1() {
        Log.d("NextActivity12", "onResume vide");
        L2();
        super.i1();
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 Bundle bundle) {
        super.m1(view, bundle);
        J2(view);
    }

    /* renamed from: o.Uc2$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC3880Ou1 {
        public b() {
        }

        @Override // o.InterfaceC3880Ou1
        public void a(Uri uri, int i) {
            C4395Uc2.this.K2(uri);
        }

        @Override // o.InterfaceC3880Ou1
        public void c(ArrayList<File> arrayList, int i) {
        }
    }
}
