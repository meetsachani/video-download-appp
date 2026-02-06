package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.FullImageScreen;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import o.I7;
import o.KK2;

/* loaded from: classes3.dex */
public class KK2 extends RecyclerView.AbstractC0370h<h> {
    public Activity d;
    public String e = C5036aE2.e + RemoteSettings.i;
    public String f;
    public InterfaceC3880Ou1 g;
    public ArrayList<JK2> h;

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ JK2 X;

        /* renamed from: o.KK2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0199a implements Runnable {
            public RunnableC0199a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5036aE2.q(KK2.this.d);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (C5036aE2.d) {
                        a aVar = a.this;
                        KK2.this.M(aVar.X.b(), a.this.X.c());
                    } else {
                        a aVar2 = a.this;
                        KK2.this.L(aVar2.X.b(), a.this.X.c());
                    }
                } else {
                    a aVar3 = a.this;
                    KK2.this.L(aVar3.X.b(), a.this.X.c());
                }
                Log.d("FullWhatsApp12", "Pass Activity = ");
                Activity activity = KK2.this.d;
                Toast.makeText(activity, "Save to " + KK2.this.e, 0).show();
            }
        }

        public a(JK2 jk2) {
            this.X = jk2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C5036aE2.e.exists()) {
                C5036aE2.e.mkdirs();
            }
            C5036aE2.w(KK2.this.d);
            new Handler().postDelayed(new RunnableC0199a(), View$OnLongClickListenerC9832tq2.g1);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public final /* synthetic */ JK2 X;

        public b(JK2 jk2) {
            this.X = jk2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (KK2.this.f.equals("")) {
                C5036aE2.v(KK2.this.d, new File(this.X.b()));
                return;
            }
            Uri parse = Uri.parse(this.X.b());
            C5036aE2.u(KK2.this.d, parse, KK2.this.d.getContentResolver().getType(parse));
        }
    }

    /* loaded from: classes3.dex */
    public class c implements View.OnClickListener {
        public final /* synthetic */ JK2 X;

        public c(JK2 jk2) {
            this.X = jk2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            Uri parse = Uri.parse(this.X.b());
            if (this.X.b().endsWith(".mp4")) {
                str = "video/*";
            } else {
                str = "image/*";
            }
            KK2.R(KK2.this.d, parse, str);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public final /* synthetic */ JK2 X;
        public final /* synthetic */ int Y;

        /* loaded from: classes3.dex */
        public class a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: o.KK2$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0200a implements MediaScannerConnection.OnScanCompletedListener {

                /* renamed from: o.KK2$d$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0201a implements MediaScannerConnection.OnScanCompletedListener {
                    public C0201a() {
                    }

                    public static /* synthetic */ void a(C0201a c0201a) {
                        Toast.makeText(KK2.this.d, "Successfully Delete Video", 0).show();
                        KK2.this.m();
                    }

                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(String str, Uri uri) {
                        KK2.this.d.runOnUiThread(new Runnable() { // from class: o.LK2
                            @Override // java.lang.Runnable
                            public final void run() {
                                KK2.d.a.C0200a.C0201a.a(KK2.d.a.C0200a.C0201a.this);
                            }
                        });
                    }
                }

                public C0200a() {
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    if (uri != null) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            d dVar = d.this;
                            KK2.this.g.a(uri, dVar.Y);
                            return;
                        }
                        KK2.this.O(str);
                        MediaScannerConnection.scanFile(KK2.this.d, new String[]{str}, null, new C0201a());
                        return;
                    }
                    Log.e("MediaScanner", "Uri is null after scanning file: " + str);
                    Toast.makeText(KK2.this.d, "Failed to get URI for file", 0).show();
                }
            }

            public a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                File file = new File(d.this.X.b());
                if (file.exists() && file.isFile()) {
                    MediaScannerConnection.scanFile(KK2.this.d, new String[]{file.getPath()}, null, new C0200a());
                    return;
                }
                Toast.makeText(KK2.this.d, "File does not exist", 0).show();
                Log.e("MediaScanner", "File does not exist: " + file.getPath());
            }
        }

        public d(JK2 jk2, int i) {
            this.X = jk2;
            this.Y = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaScannerConnection.scanFile(KK2.this.d, new String[]{this.X.b()}, null, new a());
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {
        public final /* synthetic */ JK2 X;

        /* loaded from: classes3.dex */
        public class a implements I7.f {
            public a() {
            }

            @Override // o.I7.f
            public void a(boolean z) {
                Intent intent = new Intent(KK2.this.d, FullImageScreen.class);
                intent.putExtra("path", e.this.X.b());
                intent.putExtra("uri", e.this.X.c().toString());
                intent.putExtra("Name", e.this.X.a());
                KK2.this.d.startActivity(intent);
            }
        }

        public e(JK2 jk2) {
            this.X = jk2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            I7.o(KK2.this.d, new a(), new boolean[0]);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements MediaScannerConnection.OnScanCompletedListener {
        public g() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            Log.i("ExternalStorage", "Scanned " + str + ":");
            StringBuilder sb = new StringBuilder();
            sb.append("-> uri=");
            sb.append(uri);
            Log.i("ExternalStorage", sb.toString());
        }
    }

    /* loaded from: classes3.dex */
    public class h extends RecyclerView.H {
        public ShapeableImageView I;
        public ImageView J;
        public ImageView K;
        public ImageView L;
        public ImageView M;
        public ImageView N;

        public h(@InterfaceC5670cr1 View view) {
            super(view);
            this.J = (ImageView) view.findViewById(R.id.ivStatusType);
            this.I = (ShapeableImageView) view.findViewById(R.id.ivImage);
            this.K = (ImageView) view.findViewById(R.id.ivDownload);
            this.L = (ImageView) view.findViewById(R.id.ivShare);
            this.M = (ImageView) view.findViewById(R.id.ivDetele);
            this.N = (ImageView) view.findViewById(R.id.ivRepost);
        }
    }

    public KK2(Activity activity, ArrayList<JK2> arrayList, String str, InterfaceC3880Ou1 interfaceC3880Ou1) {
        this.d = activity;
        this.h = arrayList;
        this.f = str;
        this.g = interfaceC3880Ou1;
    }

    public static void R(Context context, Uri uri, String str) {
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str);
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setPackage(FS2.c);
            intent.addFlags(1);
            context.startActivity(intent);
        } catch (Exception e2) {
            e2.printStackTrace();
            Toast.makeText(context, "Error sharing to WhatsApp", 0).show();
        }
    }

    public final void L(String str, Uri uri) {
        String str2;
        if (!C5036aE2.e.exists()) {
            C5036aE2.e.mkdirs();
        }
        String substring = str.substring(str.lastIndexOf(RemoteSettings.i) + 1);
        try {
            C3961Pq0.T(new File(str), new File(this.e));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String substring2 = substring.substring(12);
        Activity activity = this.d;
        String[] strArr = {new File(this.e + substring2).getAbsolutePath()};
        if (uri.toString().endsWith(".mp4")) {
            str2 = "simplevideoshow/*";
        } else {
            str2 = "image/*";
        }
        MediaScannerConnection.scanFile(activity, strArr, new String[]{str2}, new f());
        new File(this.e, substring).renameTo(new File(this.e, substring2));
        Activity activity2 = this.d;
        Toast.makeText(activity2, "Saved to:" + this.e + substring2, 1).show();
    }

    public final void M(String str, Uri uri) {
        if (uri.getScheme().equals("content")) {
            try {
                byte[] h2 = IOUtils.h(this.d.getContentResolver().openInputStream(uri));
                Log.d("FullWhatsApp12", "videoBytes = " + h2);
                N(h2, str.substring(str.lastIndexOf(UE.h)));
                return;
            } catch (IOException e2) {
                e2.printStackTrace();
                return;
            }
        }
        try {
            byte[] h3 = IOUtils.h(new FileInputStream(new File(str)));
            Log.d("FullWhatsApp12", "videoBytes 1 = " + h3);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public void N(byte[] bArr, String str) {
        Log.d("FullWhatsApp12", "extension = " + str);
        String str2 = ("Whatsapp_" + System.currentTimeMillis()) + str;
        Log.d("FullWhatsApp12", "SavePhotoTask = " + str2);
        File file = new File(this.e);
        if (!file.exists()) {
            Log.d("VideoDownload_Screen12", "makeing = ");
            file.mkdir();
        }
        Log.d("FullWhatsApp12", "SavePhotoTask = " + file);
        File file2 = new File(file, str2);
        Log.d("FullWhatsApp12", "photo = " + file2.getPath());
        try {
            Log.d("FullWhatsApp12", "FileOutputStream = ");
            FileOutputStream fileOutputStream = new FileOutputStream(file2.getPath());
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (Exception e2) {
            Log.d("FullWhatsApp12", "Exception = " + e2.getMessage());
        }
        MediaScannerConnection.scanFile(this.d, new String[]{file2.toString()}, null, new g());
    }

    public void O(String str) {
        File file = new File(str);
        Log.d("file_delete", "deletefile: " + file.exists());
        if (file.exists() && file.delete()) {
            Toast.makeText(this.d, "Delete Successfully ", 0).show();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: P */
    public void x(h hVar, int i) {
        JK2 jk2 = this.h.get(i);
        com.bumptech.glide.a.D(this.d).r(jk2.b()).C1(hVar.I);
        if (jk2.c().toString().endsWith(".mp4")) {
            hVar.J.setVisibility(0);
        } else {
            hVar.J.setVisibility(8);
        }
        if (this.f.equals("")) {
            C5036aE2.f = "Saved";
            hVar.M.setVisibility(0);
            hVar.K.setVisibility(8);
        } else {
            C5036aE2.f = "Image";
            hVar.M.setVisibility(8);
            hVar.K.setVisibility(0);
        }
        hVar.K.setOnClickListener(new a(jk2));
        hVar.L.setOnClickListener(new b(jk2));
        hVar.N.setOnClickListener(new c(jk2));
        hVar.M.setOnClickListener(new d(jk2, i));
        hVar.a.setOnClickListener(new e(jk2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    /* renamed from: Q */
    public h z(ViewGroup viewGroup, int i) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f.equals("video")) {
            inflate = from.inflate(R.layout.item_whatsapp_video, viewGroup, false);
        } else {
            inflate = from.inflate(R.layout.items_whatsapp_view, viewGroup, false);
        }
        return new h(inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0370h
    public int g() {
        ArrayList<JK2> arrayList = this.h;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* loaded from: classes3.dex */
    public class f implements MediaScannerConnection.MediaScannerConnectionClient {
        public f() {
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
        }
    }
}
