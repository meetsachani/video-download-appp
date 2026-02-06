package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.ImageDownload;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o.InterfaceC11300zs1;

/* loaded from: classes3.dex */
public class ImageDownload implements Closeable {
    public static final int Y0 = 1048576;
    public final URL X;
    @InterfaceC11300zs1
    public volatile Future<?> Y;
    @InterfaceC11300zs1
    public Task<Bitmap> Z;

    public ImageDownload(URL url) {
        this.X = url;
    }

    public static /* synthetic */ void a(ImageDownload imageDownload, TaskCompletionSource taskCompletionSource) {
        imageDownload.getClass();
        try {
            taskCompletionSource.c(imageDownload.d());
        } catch (Exception e) {
            taskCompletionSource.b(e);
        }
    }

    @InterfaceC11300zs1
    public static ImageDownload h(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ImageDownload(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.Y.cancel(true);
    }

    public Bitmap d() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.X);
        }
        byte[] f = f();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(f, 0, f.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.X);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.X);
    }

    public final byte[] f() throws IOException {
        URLConnection openConnection = this.X.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] e = ByteStreams.e(ByteStreams.c(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + e.length + " bytes from " + this.X);
                }
                if (e.length <= 1048576) {
                    return e;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public Task<Bitmap> i() {
        return (Task) Preconditions.r(this.Z);
    }

    public void j(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.Y = executorService.submit(new Runnable() { // from class: o.TM0
            @Override // java.lang.Runnable
            public final void run() {
                ImageDownload.a(ImageDownload.this, taskCompletionSource);
            }
        });
        this.Z = taskCompletionSource.a();
    }
}
