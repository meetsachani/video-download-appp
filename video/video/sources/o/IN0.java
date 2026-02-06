package o;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.WhatsAppStatusActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import o.C9254rS0;
import o.P5;

/* loaded from: classes3.dex */
public class IN0 extends Fragment {
    public File[] h2;
    public File[] i2;
    public KK2 k2;
    public ConstraintLayout l2;
    public SwipeRefreshLayout m2;
    public RecyclerView n2;
    public Button o2;
    public WhatsAppStatusActivity p2;
    public LinearLayout q2;
    public ArrayList<JK2> j2 = new ArrayList<>();
    public final X5<C9254rS0> r2 = X(new P5.n(), new H5() { // from class: o.HN0
        @Override // o.H5
        public final void a(Object obj) {
            IN0.I2(IN0.this, (G5) obj);
        }
    });

    /* loaded from: classes3.dex */
    public class a implements SwipeRefreshLayout.j {
        public a() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
        public void a() {
            IN0.this.j2 = new ArrayList<>();
            if (Build.VERSION.SDK_INT >= 29) {
                C5036aE2.d = true;
                if (WhatsAppStatusActivity.D1.equals("Whatsapp")) {
                    if (!C2723Dd.l0().equals("")) {
                        IN0.this.S2(Uri.parse(C2723Dd.l0()));
                    } else if (!IN0.V2(IN0.this.v(), FS2.c)) {
                        IN0.this.R2();
                    } else {
                        if (!new File(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses").getPath()).exists()) {
                            IN0.this.R2();
                        } else {
                            Log.d("Whatsappimg12", "file exist");
                            IN0.this.R2();
                        }
                    }
                } else if (!C2723Dd.v().equals("")) {
                    IN0.this.S2(Uri.parse(C2723Dd.v()));
                } else if (!IN0.V2(IN0.this.v(), FS2.a)) {
                    IN0.this.R2();
                } else {
                    if (!new File(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp.w4b/WhatsApp Business/Media/.Statuses").getPath()).exists()) {
                        IN0.this.R2();
                    } else {
                        Log.d("Whatsappimg12", "file exist");
                        IN0.this.R2();
                    }
                }
            } else {
                C5036aE2.d = false;
                IN0.this.U2();
            }
            IN0.this.m2.setRefreshing(false);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Log.d("TAG21121", "onClick: ");
            if (Build.VERSION.SDK_INT >= 29) {
                C5036aE2.d = true;
                if (WhatsAppStatusActivity.D1.equals("Whatsapp")) {
                    if (!C2723Dd.l0().equals("")) {
                        IN0.this.S2(Uri.parse(C2723Dd.l0()));
                        return;
                    } else if (!IN0.V2(IN0.this.v(), FS2.c)) {
                        IN0.this.T2("Please Install Whatsapp For Download Status!!!");
                        return;
                    } else {
                        if (new File(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses").getPath()).exists()) {
                            C5036aE2.d = true;
                            Log.d("Whatsappimg12", "file exist");
                            IN0.this.X2();
                            return;
                        }
                        Log.d("Whatsappimg12", "not file exist");
                        IN0.this.T2("Please Seen Status");
                        return;
                    }
                } else if (!C2723Dd.v().equals("")) {
                    IN0.this.S2(Uri.parse(C2723Dd.v()));
                    return;
                } else if (!IN0.V2(IN0.this.v(), FS2.a)) {
                    IN0.this.T2("Please Install Whatsapp For Download Status!!!");
                    return;
                } else {
                    Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp.w4b/WhatsApp Business/Media/.Statuses");
                    if (!IN0.V2(IN0.this.v(), FS2.a)) {
                        IN0.this.T2("Please Install Whatsapp For Download Status!!!");
                        return;
                    } else if (!new File(parse.getPath()).exists()) {
                        IN0.this.T2("Please Seen Status");
                        return;
                    } else {
                        C5036aE2.d = true;
                        Log.d("Whatsappimg12", "file exist");
                        IN0.this.W2();
                        return;
                    }
                }
            }
            C5036aE2.d = false;
            IN0.this.U2();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IN0.this.Q2();
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IN0.this.Q2();
        }
    }

    public static /* synthetic */ int G2(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file.lastModified() > file2.lastModified()) {
            return -1;
        }
        if (file.lastModified() < file2.lastModified()) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ int H2(Object obj, Object obj2) {
        File file = (File) obj;
        File file2 = (File) obj2;
        if (file.lastModified() > file2.lastModified()) {
            return -1;
        }
        if (file.lastModified() < file2.lastModified()) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ void I2(IN0 in0, G5 g5) {
        in0.getClass();
        if (g5.b() == -1) {
            Toast.makeText(in0.o(), "succesfully", 0).show();
            in0.o().runOnUiThread(new f());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U2() {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses");
        this.h2 = file.listFiles();
        if (file.listFiles() == null) {
            this.h2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/WhatsApp/Media/.Statuses").listFiles();
        }
        File file2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp.w4b/WhatsApp Business/Media/.Statuses");
        this.i2 = file2.listFiles();
        if (file2.listFiles() == null) {
            this.i2 = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/WhatsApp Business/Media/.Statuses").listFiles();
        }
        File[] fileArr = this.h2;
        if (fileArr != null) {
            try {
                Arrays.sort(fileArr, new Comparator() { // from class: o.FN0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return IN0.G2(obj, obj2);
                    }
                });
                int i = 0;
                while (true) {
                    File[] fileArr2 = this.h2;
                    if (i >= fileArr2.length) {
                        break;
                    }
                    File file3 = fileArr2[i];
                    if (!Uri.fromFile(file3).toString().endsWith(C5179aq.s1) && !Uri.fromFile(file3).toString().endsWith(C4940Zp0.X)) {
                        i++;
                    }
                    this.j2.add(new JK2(Uri.fromFile(file3), this.h2[i].getAbsolutePath(), file3.getName()));
                    i++;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        File[] fileArr3 = this.i2;
        if (fileArr3 != null) {
            try {
                Arrays.sort(fileArr3, new Comparator() { // from class: o.GN0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return IN0.H2(obj, obj2);
                    }
                });
                int i2 = 0;
                while (true) {
                    File[] fileArr4 = this.i2;
                    if (i2 >= fileArr4.length) {
                        break;
                    }
                    File file4 = fileArr4[i2];
                    if (!Uri.fromFile(file4).toString().endsWith(C5179aq.s1) && !Uri.fromFile(file4).toString().endsWith(C4940Zp0.X)) {
                        i2++;
                    }
                    this.j2.add(new JK2(Uri.fromFile(file4), this.i2[i2].getAbsolutePath(), file4.getName()));
                    i2++;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        if (this.j2.size() != 0) {
            this.q2.setVisibility(8);
        } else {
            this.q2.setVisibility(0);
        }
        KK2 kk2 = new KK2(o(), this.j2, "image", new c());
        this.k2 = kk2;
        this.n2.setAdapter(kk2);
    }

    public static boolean V2(Context context, String str) {
        if (context.getPackageManager().getPackageInfo(str, 0) == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"WrongConstant"})
    public void I0(int i, int i2, @InterfaceC11300zs1 Intent intent) {
        super.I0(i, i2, intent);
        Log.d("NextActivity12", "onActivityResult");
        if (i2 == -1) {
            Log.d("NextActivity12", "RESULT_OK");
            if (i == 42) {
                Log.d("NextActivity12", WU1.e);
                if (intent != null) {
                    Log.d("NextActivity12", "data");
                    Uri data = intent.getData();
                    Log.d("NextActivity12", "uri = " + data);
                    if (data.getPath().endsWith(".Statuses")) {
                        Log.d("TAG", "onActivityResult: " + data.getPath());
                        int i3 = Build.VERSION.SDK_INT;
                        Log.d("NextActivity12", "KITKAT = ");
                        o().getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
                        if (i3 >= 29) {
                            C2723Dd.I1(String.valueOf(data));
                            S2(Uri.parse(C2723Dd.l0()));
                        }
                        Toast.makeText(v(), "Permission allow", 0).show();
                        return;
                    }
                    Toast.makeText(v(), "Permission not allow", 0).show();
                    ((Activity) v()).finish();
                    return;
                }
                return;
            } else if (i == 40 && intent != null) {
                Log.d("NextActivity12", "data");
                Uri data2 = intent.getData();
                Log.d("NextActivity12", "uri = " + data2);
                if (data2.getPath().endsWith(".Statuses")) {
                    Log.d("TAG", "onActivityResult: " + data2.getPath());
                    int i4 = Build.VERSION.SDK_INT;
                    Log.d("NextActivity12", "KITKAT = ");
                    o().getContentResolver().takePersistableUriPermission(data2, intent.getFlags() & 3);
                    if (i4 >= 29) {
                        C2723Dd.S0(String.valueOf(data2));
                        S2(Uri.parse(C2723Dd.v()));
                    }
                    Toast.makeText(v(), "Permission allow", 0).show();
                    return;
                }
                Toast.makeText(v(), "Permission not allow", 0).show();
                ((Activity) v()).finish();
                return;
            } else {
                return;
            }
        }
        Toast.makeText(v(), "Permission not allow", 0).show();
        ((Activity) v()).finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void N0(@InterfaceC11300zs1 Bundle bundle) {
        super.N0(bundle);
        this.p2 = (WhatsAppStatusActivity) o();
    }

    public final void O2(View view) {
        this.l2 = (ConstraintLayout) view.findViewById(R.id.clPermission);
        this.m2 = (SwipeRefreshLayout) view.findViewById(R.id.swiperefresh);
        this.n2 = (RecyclerView) view.findViewById(R.id.rv_fileList);
        this.o2 = (Button) view.findViewById(R.id.btnAllowAccess);
        this.q2 = (LinearLayout) view.findViewById(R.id.no_data);
    }

    public void P2(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = o().getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(o(), "Successfully Delete Video", 0).show();
            o().runOnUiThread(new e());
        } catch (SecurityException e2) {
            Log.d("uri:==", "DeleteVideo121: ");
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                Log.d("uri:==", "SDK_INT: ");
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createDeleteRequest(contentResolver, arrayList);
            } else if (i >= 29) {
                Log.d("uri:==", "VERSION_CODES: ");
                if (C6641go1.a(e2)) {
                    userAction = C6884ho1.a(e2).getUserAction();
                    pendingIntent = userAction.getActionIntent();
                }
            }
            if (pendingIntent != null) {
                this.r2.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(o(), "Successfully Delete Video", 0).show();
            }
        }
    }

    public final void Q2() {
        this.j2 = new ArrayList<>();
        this.n2.setLayoutManager(new GridLayoutManager(o(), 2));
        if (Build.VERSION.SDK_INT >= 29) {
            C5036aE2.d = true;
            if (WhatsAppStatusActivity.D1.equals("Whatsapp")) {
                if (C2723Dd.l0().equals("")) {
                    if (V2(v(), FS2.c)) {
                        if (new File(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp/WhatsApp/Media/.Statuses").getPath()).exists()) {
                            Log.d("Whatsappimg12", "file exist");
                            R2();
                        } else {
                            R2();
                        }
                    } else {
                        R2();
                    }
                } else {
                    S2(Uri.parse(C2723Dd.l0()));
                }
            } else if (C2723Dd.v().equals("")) {
                if (V2(v(), FS2.a)) {
                    if (new File(Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/media/com.whatsapp.w4b/WhatsApp Business/Media/.Statuses").getPath()).exists()) {
                        Log.d("Whatsappimg12", "file exist");
                        R2();
                    } else {
                        R2();
                    }
                } else {
                    R2();
                }
            } else {
                S2(Uri.parse(C2723Dd.v()));
            }
        } else {
            C5036aE2.d = false;
            U2();
        }
        this.m2.setOnRefreshListener(new a());
        this.o2.setOnClickListener(new b());
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC11300zs1
    public View R0(@InterfaceC5670cr1 LayoutInflater layoutInflater, @InterfaceC11300zs1 ViewGroup viewGroup, @InterfaceC11300zs1 Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_whatsappimagefragment, viewGroup, false);
    }

    public final void R2() {
        C5036aE2.d = false;
        this.l2.setVisibility(0);
        this.m2.setVisibility(8);
    }

    public final void S2(Uri uri) {
        Q40[] u = Q40.j(v(), uri).u();
        Log.d("NextActivity12", "allow " + u.length);
        for (int i = 0; i < u.length; i++) {
            try {
                String uri2 = u[i].n().toString();
                Log.d("NextActiv12", "path = " + uri2);
                if (!uri2.endsWith(C5179aq.s1) && !uri2.endsWith(C4940Zp0.X)) {
                }
                this.j2.add(new JK2(u[i].n(), uri2, u[i].k()));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.j2.size() != 0) {
            this.q2.setVisibility(8);
            this.l2.setVisibility(8);
            this.m2.setVisibility(0);
        } else {
            this.q2.setVisibility(0);
            this.l2.setVisibility(8);
            this.m2.setVisibility(8);
        }
        KK2 kk2 = new KK2(o(), this.j2, "image", new d());
        this.k2 = kk2;
        this.n2.setAdapter(kk2);
    }

    public final void T2(String str) {
        R2();
        Toast.makeText(this.p2, str, 0).show();
    }

    public void W2() {
        Intent intent;
        Toast.makeText(v(), "Please allow permission to download directchatwatool!", 0).show();
        StorageManager storageManager = (StorageManager) o().getSystemService("storage");
        if (Build.VERSION.SDK_INT >= 29) {
            intent = EN0.a(storageManager.getPrimaryStorageVolume());
        } else {
            intent = null;
        }
        String uri = ((Uri) intent.getParcelableExtra("android.provider.extra.INITIAL_URI")).toString();
        Log.d("TAG", "INITIAL_URI scheme: " + uri);
        String replace = uri.replace("/root/", "/document/");
        Uri parse = Uri.parse(replace + "%3AAndroid%2Fmedia%2Fcom.whatsapp.w4b%2FWhatsApp Business%2FMedia%2F.Statuses");
        intent.putExtra("android.provider.extra.INITIAL_URI", parse);
        Log.d("TAG", "uri: " + parse.toString());
        startActivityForResult(intent, 40);
    }

    public void X2() {
        Intent intent;
        Toast.makeText(v(), "Please allow permission to download directchatwatool!", 0).show();
        StorageManager storageManager = (StorageManager) o().getSystemService("storage");
        if (Build.VERSION.SDK_INT >= 29) {
            intent = EN0.a(storageManager.getPrimaryStorageVolume());
        } else {
            intent = null;
        }
        String uri = ((Uri) intent.getParcelableExtra("android.provider.extra.INITIAL_URI")).toString();
        Log.d("TAG", "INITIAL_URI scheme: " + uri);
        String replace = uri.replace("/root/", "/document/");
        Uri parse = Uri.parse(replace + "%3AAndroid%2Fmedia%2Fcom.whatsapp%2FWhatsApp%2FMedia%2F.Statuses");
        intent.putExtra("android.provider.extra.INITIAL_URI", parse);
        Log.d("TAG", "uri: " + parse.toString());
        startActivityForResult(intent, 42);
    }

    @Override // androidx.fragment.app.Fragment
    public void m1(@InterfaceC5670cr1 View view, @InterfaceC11300zs1 Bundle bundle) {
        super.m1(view, bundle);
        O2(view);
        Q2();
    }

    /* loaded from: classes3.dex */
    public class c implements InterfaceC3880Ou1 {
        public c() {
        }

        @Override // o.InterfaceC3880Ou1
        public void a(Uri uri, int i) {
            IN0.this.P2(uri);
        }

        @Override // o.InterfaceC3880Ou1
        public void c(ArrayList<File> arrayList, int i) {
        }
    }

    /* loaded from: classes3.dex */
    public class d implements InterfaceC3880Ou1 {
        public d() {
        }

        @Override // o.InterfaceC3880Ou1
        public void a(Uri uri, int i) {
            IN0.this.P2(uri);
        }

        @Override // o.InterfaceC3880Ou1
        public void c(ArrayList<File> arrayList, int i) {
        }
    }
}
