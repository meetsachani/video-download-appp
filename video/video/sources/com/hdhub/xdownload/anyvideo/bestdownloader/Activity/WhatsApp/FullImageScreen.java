package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import com.google.android.gms.common.util.IOUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.FullImageScreen;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C3961Pq0;
import o.C4343To;
import o.C5036aE2;
import o.C6641go1;
import o.C6884ho1;
import o.C9254rS0;
import o.G5;
import o.H5;
import o.P5;
import o.UE;
import o.View$OnLongClickListenerC9832tq2;
import o.X5;

/* loaded from: classes3.dex */
public class FullImageScreen extends ActivityC3020Gb {
    public ImageView D1;
    public ImageView E1;
    public ImageView F1;
    public LinearLayout G1;
    public LinearLayout H1;
    public LinearLayout I1;
    public String J1;
    public String K1;
    public String L1;
    public VideoView M1;
    public String C1 = C5036aE2.e + RemoteSettings.i;
    public final X5<C9254rS0> N1 = X(new P5.n(), new H5() { // from class: o.uA0
        @Override // o.H5
        public final void a(Object obj) {
            FullImageScreen.F1(FullImageScreen.this, (G5) obj);
        }
    });

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullImageScreen.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FullImageScreen.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            VideoView videoView = FullImageScreen.this.M1;
            if (videoView != null && videoView.isPlaying()) {
                FullImageScreen.this.M1.stopPlayback();
            }
            C5036aE2.a(FullImageScreen.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C5036aE2.f.equals("Saved")) {
                C5036aE2.v(FullImageScreen.this, new File(FullImageScreen.this.J1));
                return;
            }
            Uri parse = Uri.parse(FullImageScreen.this.J1);
            C5036aE2.u(FullImageScreen.this, parse, FullImageScreen.this.getContentResolver().getType(parse));
        }
    }

    /* loaded from: classes3.dex */
    public class e implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C5036aE2.q(FullImageScreen.this);
                if (Build.VERSION.SDK_INT >= 29) {
                    if (C5036aE2.d) {
                        FullImageScreen fullImageScreen = FullImageScreen.this;
                        fullImageScreen.L1(fullImageScreen.J1, Uri.parse(fullImageScreen.K1));
                    } else {
                        FullImageScreen fullImageScreen2 = FullImageScreen.this;
                        fullImageScreen2.K1(fullImageScreen2.J1, Uri.parse(fullImageScreen2.K1));
                    }
                } else {
                    FullImageScreen fullImageScreen3 = FullImageScreen.this;
                    fullImageScreen3.K1(fullImageScreen3.J1, Uri.parse(fullImageScreen3.K1));
                }
                Log.d("FullWhatsApp12", "Pass Activity = ");
                FullImageScreen fullImageScreen4 = FullImageScreen.this;
                Toast.makeText(fullImageScreen4, "Save to " + FullImageScreen.this.C1, 0).show();
            }
        }

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!C5036aE2.e.exists()) {
                C5036aE2.e.mkdirs();
            }
            C5036aE2.w(FullImageScreen.this);
            new Handler().postDelayed(new a(), View$OnLongClickListenerC9832tq2.g1);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {

        /* loaded from: classes3.dex */
        public class a implements MediaScannerConnection.OnScanCompletedListener {

            /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.FullImageScreen$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0145a implements MediaScannerConnection.OnScanCompletedListener {

                /* renamed from: com.hdhub.xdownload.anyvideo.bestdownloader.Activity.WhatsApp.FullImageScreen$g$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes3.dex */
                public class C0146a implements MediaScannerConnection.OnScanCompletedListener {
                    public C0146a() {
                    }

                    public static /* synthetic */ void a(C0146a c0146a) {
                        Toast.makeText(FullImageScreen.this, "Successfully Delete Video", 0).show();
                        FullImageScreen.this.R().l();
                    }

                    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                    public void onScanCompleted(String str, Uri uri) {
                        FullImageScreen.this.runOnUiThread(new Runnable() { // from class: o.vA0
                            @Override // java.lang.Runnable
                            public final void run() {
                                FullImageScreen.g.a.C0145a.C0146a.a(FullImageScreen.g.a.C0145a.C0146a.this);
                            }
                        });
                    }
                }

                public C0145a() {
                }

                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public void onScanCompleted(String str, Uri uri) {
                    if (uri != null) {
                        if (Build.VERSION.SDK_INT >= 30) {
                            FullImageScreen.this.J1(uri);
                            return;
                        }
                        FullImageScreen.this.P1(str);
                        MediaScannerConnection.scanFile(FullImageScreen.this, new String[]{str}, null, new C0146a());
                        return;
                    }
                    Log.e("MediaScanner", "Uri is null after scanning file: " + str);
                    Toast.makeText(FullImageScreen.this, "Failed to get URI for file", 0).show();
                }
            }

            public a() {
            }

            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public void onScanCompleted(String str, Uri uri) {
                File file = new File(str);
                if (file.exists() && file.isFile()) {
                    MediaScannerConnection.scanFile(FullImageScreen.this, new String[]{file.getPath()}, null, new C0145a());
                    return;
                }
                Toast.makeText(FullImageScreen.this, "File does not exist", 0).show();
                Log.e("MediaScanner", "File does not exist: " + file.getPath());
            }
        }

        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FullImageScreen fullImageScreen = FullImageScreen.this;
            MediaScannerConnection.scanFile(fullImageScreen, new String[]{fullImageScreen.J1}, null, new a());
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullImageScreen.this.onBackPressed();
        }
    }

    /* loaded from: classes3.dex */
    public class i implements MediaScannerConnection.MediaScannerConnectionClient {
        public i() {
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
        }
    }

    public static /* synthetic */ void F1(FullImageScreen fullImageScreen, G5 g5) {
        fullImageScreen.getClass();
        if (g5.b() == -1) {
            Toast.makeText(fullImageScreen, "succesfully", 0).show();
            fullImageScreen.runOnUiThread(new a());
        }
    }

    public final void I1() {
        this.G1 = (LinearLayout) findViewById(R.id.clSave);
        this.D1 = (ImageView) findViewById(R.id.iv_back);
        this.F1 = (ImageView) findViewById(R.id.ic_play);
        this.E1 = (ImageView) findViewById(R.id.image);
        this.M1 = (VideoView) findViewById(R.id.videoView);
        this.H1 = (LinearLayout) findViewById(R.id.clShare);
        this.I1 = (LinearLayout) findViewById(R.id.clDetele);
        this.J1 = getIntent().getStringExtra("path");
        this.K1 = getIntent().getStringExtra("uri");
        this.L1 = getIntent().getStringExtra("Name");
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
    }

    public void J1(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(this, "Successfully Delete Video", 0).show();
            runOnUiThread(new h());
        } catch (SecurityException e2) {
            Log.d("uri:==", "DeleteVideo121: ");
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                Log.d("uri:==", "SDK_INT: ");
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createDeleteRequest(contentResolver, arrayList);
            } else if (i2 >= 29) {
                Log.d("uri:==", "VERSION_CODES: ");
                if (C6641go1.a(e2)) {
                    userAction = C6884ho1.a(e2).getUserAction();
                    pendingIntent = userAction.getActionIntent();
                }
            }
            if (pendingIntent != null) {
                this.N1.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(this, "Successfully Delete Video", 0).show();
            }
        }
    }

    public final void K1(String str, Uri uri) {
        String str2;
        if (!C5036aE2.e.exists()) {
            C5036aE2.e.mkdirs();
        }
        String substring = str.substring(str.lastIndexOf(RemoteSettings.i) + 1);
        try {
            C3961Pq0.T(new File(str), new File(this.C1));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        String substring2 = substring.substring(12);
        String[] strArr = {new File(this.C1 + substring2).getAbsolutePath()};
        if (uri.toString().endsWith(".mp4")) {
            str2 = "simplevideoshow/*";
        } else {
            str2 = "image/*";
        }
        MediaScannerConnection.scanFile(this, strArr, new String[]{str2}, new i());
        new File(this.C1, substring).renameTo(new File(this.C1, substring2));
        Toast.makeText(this, "Saved to:" + this.C1 + substring2, 1).show();
    }

    public final void L1(String str, Uri uri) {
        if (uri.getScheme().equals("content")) {
            try {
                byte[] h2 = IOUtils.h(getContentResolver().openInputStream(uri));
                Log.d("FullWhatsApp12", "videoBytes = " + h2);
                O1(h2, str.substring(str.lastIndexOf(UE.h)));
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

    public final void M1() {
        this.D1.setOnClickListener(new b());
        R().e(new c(true));
        if (C5036aE2.f.equals("Saved")) {
            this.G1.setVisibility(8);
            this.I1.setVisibility(0);
        } else {
            this.G1.setVisibility(0);
            this.I1.setVisibility(8);
        }
        if (this.K1.endsWith(".mp4")) {
            this.F1.setVisibility(0);
            N1();
        } else {
            this.F1.setVisibility(8);
        }
        com.bumptech.glide.a.I(this).r(this.J1).C1(this.E1);
        this.H1.setOnClickListener(new d());
        this.G1.setOnClickListener(new e());
        this.F1.setOnClickListener(new f());
        this.I1.setOnClickListener(new g());
    }

    public final void N1() {
        this.E1.setVisibility(8);
        this.F1.setVisibility(8);
        this.M1.setVisibility(0);
        this.M1.setVideoURI(Uri.parse(this.K1));
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(this.M1);
        mediaController.setMediaPlayer(this.M1);
        this.M1.setMediaController(mediaController);
        this.M1.start();
    }

    public void O1(byte[] bArr, String str) {
        Log.d("FullWhatsApp12", "extension = " + str);
        String str2 = ("Whatsapp_" + System.currentTimeMillis()) + str;
        Log.d("FullWhatsApp12", "SavePhotoTask = " + str2);
        File file = new File(this.C1);
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
    }

    public void P1(String str) {
        File file = new File(str);
        Log.d("file_delete", "deletefile: " + file.exists());
        if (file.exists() && file.delete()) {
            Toast.makeText(this, "Delete Successfully ", 0).show();
        }
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_full_image_screen);
        I1();
        M1();
    }

    @Override // o.ActivityC4864Yy0, android.app.Activity
    public void onResume() {
        super.onResume();
        C5036aE2.s(this, getClass().getSimpleName(), getClass().getSimpleName());
        if (this.K1.endsWith(".mp4")) {
            N1();
        } else {
            this.F1.setVisibility(8);
        }
    }
}
