package com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer;

import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.RemoteAction;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.hdhub.xdownload.anyvideo.bestdownloader.Activity.VideoPlayer.VideoListActivity;
import com.hdhub.xdownload.anyvideo.bestdownloader.R;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import o.AbstractC2891Eu1;
import o.ActivityC3020Gb;
import o.C4343To;
import o.C5036aE2;
import o.C6641go1;
import o.C6884ho1;
import o.C7925m6;
import o.C9208rG2;
import o.C9254rS0;
import o.CY;
import o.G5;
import o.H5;
import o.I7;
import o.InterfaceC3977Pu1;
import o.InterfaceC9116qv1;
import o.LG;
import o.P5;
import o.X5;

/* loaded from: classes3.dex */
public class VideoListActivity extends ActivityC3020Gb implements InterfaceC9116qv1, InterfaceC3977Pu1 {
    public C7925m6 C1;
    public String D1;
    public C9208rG2 E1;
    public ArrayList<File> F1;
    public ProgressDialog H1;
    public File I1;
    public final X5<C9254rS0> G1 = X(new P5.n(), new H5() { // from class: o.nG2
        @Override // o.H5
        public final void a(Object obj) {
            VideoListActivity.I1(VideoListActivity.this, (G5) obj);
        }
    });
    public final X5<C9254rS0> J1 = X(new P5.n(), new H5() { // from class: o.oG2
        @Override // o.H5
        public final void a(Object obj) {
            VideoListActivity.F1(VideoListActivity.this, (G5) obj);
        }
    });

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoListActivity.this.M1();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoListActivity.this.R().l();
        }
    }

    /* loaded from: classes3.dex */
    public class c extends AbstractC2891Eu1 {
        public c(boolean z) {
            super(z);
        }

        @Override // o.AbstractC2891Eu1
        public void d() {
            C5036aE2.a(VideoListActivity.this);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements MediaScannerConnection.OnScanCompletedListener {
        public d() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            if (Build.VERSION.SDK_INT >= 30) {
                VideoListActivity videoListActivity = VideoListActivity.this;
                videoListActivity.L1(videoListActivity, uri);
                return;
            }
            VideoListActivity videoListActivity2 = VideoListActivity.this;
            videoListActivity2.O1(videoListActivity2);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements I7.f {
        public final /* synthetic */ int a;

        public e(int i) {
            this.a = i;
        }

        @Override // o.I7.f
        public void a(boolean z) {
            VideoListActivity.this.startActivity(new Intent(VideoListActivity.this.getApplicationContext(), VideoPlayActivity.class).putExtra("position", this.a).putExtra(C5036aE2.a, VideoListActivity.this.D1));
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoListActivity.this.M1();
        }
    }

    public static /* synthetic */ void F1(VideoListActivity videoListActivity, G5 g5) {
        videoListActivity.getClass();
        if (g5.b() == -1) {
            videoListActivity.O1(videoListActivity);
        }
    }

    public static /* synthetic */ void G1(VideoListActivity videoListActivity, Context context) {
        ProgressDialog progressDialog = videoListActivity.H1;
        if (progressDialog != null && progressDialog.isShowing()) {
            videoListActivity.H1.dismiss();
        }
        Toast.makeText(context, "Video moved to Private folder", 0).show();
        File file = videoListActivity.I1;
        if (file != null && videoListActivity.F1.contains(file)) {
            int indexOf = videoListActivity.F1.indexOf(videoListActivity.I1);
            videoListActivity.F1.remove(indexOf);
            videoListActivity.E1.v(indexOf);
            videoListActivity.E1.r(indexOf, videoListActivity.F1.size());
        }
        if (videoListActivity.F1.isEmpty()) {
            videoListActivity.onBackPressed();
        } else {
            videoListActivity.E1.m();
        }
    }

    public static /* synthetic */ void I1(VideoListActivity videoListActivity, G5 g5) {
        videoListActivity.getClass();
        if (g5.b() == -1) {
            Toast.makeText(videoListActivity, "succesfully", 0).show();
            videoListActivity.runOnUiThread(new a());
        }
    }

    public void K1(Uri uri) {
        RemoteAction userAction;
        ContentResolver contentResolver = getContentResolver();
        PendingIntent pendingIntent = null;
        try {
            Log.d("uri:==", "DeleteVideo: " + uri);
            contentResolver.delete(uri, null, null);
            Toast.makeText(this, "Successfully Delete Image", 0).show();
            runOnUiThread(new f());
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
                this.G1.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
                Toast.makeText(this, "Successfully Delete Image", 0).show();
            }
        }
    }

    @Override // o.InterfaceC9116qv1
    public void L(int i) {
        I7.o(this, new e(i), new boolean[0]);
    }

    public void L1(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        PendingIntent pendingIntent = null;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                contentResolver.update(uri, contentValues, null);
            }
            O1(this);
        } catch (SecurityException unused) {
            if (Build.VERSION.SDK_INT >= 30) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(uri);
                pendingIntent = MediaStore.createWriteRequest(contentResolver, arrayList);
            }
            if (pendingIntent != null) {
                this.J1.b(new C9254rS0.a(pendingIntent.getIntentSender()).a());
            }
        }
    }

    public final void M1() {
        this.C1.f.setText(getIntent().getStringExtra(C5036aE2.b));
        this.D1 = getIntent().getStringExtra(C5036aE2.a);
        this.F1 = new ArrayList<>();
        ArrayList<File> c2 = LG.c(new File(this.D1));
        this.F1 = c2;
        if (c2.isEmpty()) {
            this.C1.d.setVisibility(0);
            this.C1.e.setVisibility(8);
            return;
        }
        this.C1.d.setVisibility(8);
        this.C1.e.setVisibility(0);
        C9208rG2 c9208rG2 = new C9208rG2(this, this.F1, this, this);
        this.E1 = c9208rG2;
        this.C1.e.setAdapter(c9208rG2);
        this.C1.c.setOnClickListener(new b());
        R().e(new c(true));
    }

    public final void N1(final Context context) {
        File file = new File(this.I1.getPath());
        Uri h = FileProvider.h(context, context.getPackageName() + ".fileprovider", file);
        ContentResolver contentResolver = context.getContentResolver();
        Log.d("VideoMove", "setHiddenAVideo: " + file.getName());
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName() + ".playx");
        contentValues.put(CY.i, "application/playx");
        contentValues.put("relative_path", Environment.DIRECTORY_DOCUMENTS + "/Video Folder");
        Uri insert = contentResolver.insert(MediaStore.Files.getContentUri("external"), contentValues);
        if (insert == null) {
            Log.e("VideoMove", "Failed to create new file in MediaStore.");
            return;
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(h);
            OutputStream openOutputStream = contentResolver.openOutputStream(insert);
            try {
                if (openInputStream != null && openOutputStream != null) {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        openOutputStream.write(bArr, 0, read);
                    }
                    contentResolver.delete(h, null, null);
                    runOnUiThread(new Runnable() { // from class: o.qG2
                        @Override // java.lang.Runnable
                        public final void run() {
                            VideoListActivity.G1(VideoListActivity.this, context);
                        }
                    });
                    Log.d("VideoMove", "Video moved successfully.");
                    openOutputStream.close();
                } else {
                    Log.e("VideoMove", "Error opening streams.");
                    if (openOutputStream != null) {
                        openOutputStream.close();
                    }
                    if (openInputStream == null) {
                        return;
                    }
                }
                openInputStream.close();
            } catch (Throwable th) {
                if (openOutputStream != null) {
                    try {
                        openOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            Log.e("VideoMove", "Error moving video: " + e2.getMessage());
        }
    }

    public void O1(final Context context) {
        ProgressDialog progressDialog = new ProgressDialog(context);
        this.H1 = progressDialog;
        progressDialog.setMessage("please wait.");
        this.H1.show();
        new Thread(new Runnable() { // from class: o.pG2
            @Override // java.lang.Runnable
            public final void run() {
                VideoListActivity.this.N1(context);
            }
        }).start();
    }

    @Override // o.InterfaceC3977Pu1
    public void a(Uri uri, int i) {
        K1(uri);
    }

    @Override // o.InterfaceC3977Pu1
    public void c(ArrayList<File> arrayList, int i) {
        File file = arrayList.get(i);
        this.I1 = file;
        MediaScannerConnection.scanFile(this, new String[]{file.getPath()}, null, new d());
    }

    @Override // o.ActivityC4864Yy0, androidx.activity.ComponentActivity, o.ActivityC8964qI, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C7925m6 c2 = C7925m6.c(getLayoutInflater());
        this.C1 = c2;
        setContentView(c2.getRoot());
        C4343To.j(this, (LinearLayout) findViewById(R.id.llnative), (LinearLayout) findViewById(R.id.llline));
        M1();
    }
}
