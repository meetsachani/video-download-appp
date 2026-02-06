package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BuildConfig;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.internal.util.common.Preconditions;
import dalvik.system.DexClassLoader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC11300zs1;
import o.InterfaceC2992Fs1;
import o.InterfaceC5056aJ2;
import o.K80;
import o.L80;
import o.M80;

@InterfaceC2992Fs1(InterfaceC2992Fs1.a.X)
@Keep
/* loaded from: classes2.dex */
public class DynamicLoaderFactory {
    private static final String AUDIENCE_NETWORK_CODE_PATH = "audience_network";
    public static final String AUDIENCE_NETWORK_DEX_FOLDER_NAME = "audience_network";
    private static final String CODE_CACHE_DIR = "code_cache";
    static final String DEX_LOADING_ERROR_MESSAGE = "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.";
    private static final int DEX_LOAD_RETRY_COUNT = 3;
    private static final int DEX_LOAD_RETRY_DELAY_MS = 200;
    private static final String DYNAMIC_LOADING_BUILD_TYPE = "releaseDL";
    private static final String OPTIMIZED_DEX_PATH = "optimized";
    private static boolean sFallbackMode;
    public static final boolean LOAD_FROM_ASSETS = "releaseDL".equals(BuildConfig.BUILD_TYPE);
    @InterfaceC5056aJ2
    public static final AtomicReference<DynamicLoader> sDynamicLoader = new AtomicReference<>();
    private static final AtomicBoolean sInitializing = new AtomicBoolean();

    /* loaded from: classes2.dex */
    public interface RemoteClassLoaderFactory {
        @InterfaceC11300zs1
        ClassLoader create(Context context);
    }

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context X;
        public final /* synthetic */ boolean Y;
        public final /* synthetic */ AudienceNetworkAds.InitListener Y0;
        public final /* synthetic */ MultithreadedBundleWrapper Z;

        public a(Context context, boolean z, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener) {
            this.X = context;
            this.Y = z;
            this.Z = multithreadedBundleWrapper;
            this.Y0 = initListener;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"CatchGeneralException"})
        public void run() {
            DynamicLoader dynamicLoader;
            ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.X);
            synchronized (DynamicLoaderFactory.class) {
                DynamicLoader dynamicLoader2 = null;
                if (0 < 3) {
                    try {
                        dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.X, false);
                    }
                }
                dynamicLoader = dynamicLoader2;
            }
            DynamicLoaderFactory.doCallInitialize(this.X, dynamicLoader, null, this.Y, this.Z, this.Y0);
            DynamicLoaderFactory.sInitializing.set(false);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public final /* synthetic */ AudienceNetworkAds.InitListener X;
        public final /* synthetic */ Throwable Y;

        public b(AudienceNetworkAds.InitListener initListener, Throwable th) {
            this.X = initListener;
            this.Y = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.X.onInitialized(DynamicLoaderFactory.createErrorInitResult(this.Y));
        }
    }

    /* loaded from: classes2.dex */
    public class c implements AudienceNetworkAds.InitResult {
        public final /* synthetic */ Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public String getMessage() {
            return DynamicLoaderFactory.createErrorMessage(this.a);
        }

        @Override // com.facebook.ads.AudienceNetworkAds.InitResult
        public boolean isSuccess() {
            return false;
        }
    }

    public static /* synthetic */ String access$100(Throwable th) {
        return createErrorMessage(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AudienceNetworkAds.InitResult createErrorInitResult(Throwable th) {
        return new c(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createErrorMessage(Throwable th) {
        return "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder.\n" + stackTraceToString(th);
    }

    @SuppressLint({"CatchGeneralException"})
    @TargetApi(27)
    private static ClassLoader createInMemoryClassLoader(Context context) throws IOException {
        try {
            ClassLoader create = ((RemoteClassLoaderFactory) context.getClassLoader().loadClass("com.facebook.ads.internal.dynamicloading.RemoteClassLoaderFactoryImpl").getDeclaredConstructor(null).newInstance(null)).create(context);
            if (create != null) {
                return create;
            }
        } catch (Exception unused) {
            FlashPreferences.getSharedPreferences(context).edit().clear().apply();
        }
        String[] list = context.getAssets().list("audience_network");
        if (list != null && list.length != 0) {
            ByteBuffer[] byteBufferArr = new ByteBuffer[list.length];
            for (int i = 0; i < list.length; i++) {
                String str = list[i];
                InputStream open = context.getAssets().open("audience_network" + File.separator + str);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                }
                open.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                byteBufferArr[i] = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
            }
            L80.a();
            return K80.a(byteBufferArr, DynamicLoaderFactory.class.getClassLoader());
        }
        Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
        throw new RuntimeException("Failed to find assets in audience_network");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void doCallInitialize(Context context, @InterfaceC11300zs1 DynamicLoader dynamicLoader, @InterfaceC11300zs1 Throwable th, boolean z, @InterfaceC11300zs1 MultithreadedBundleWrapper multithreadedBundleWrapper, @InterfaceC11300zs1 AudienceNetworkAds.InitListener initListener) {
        if (th != null) {
            if (initListener != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new b(initListener, th), 100L);
            } else {
                Log.e(AudienceNetworkAds.TAG, DEX_LOADING_ERROR_MESSAGE, th);
            }
        } else if (dynamicLoader != null) {
            if (z) {
                dynamicLoader.createAudienceNetworkAdsApi().onContentProviderCreated(context);
            } else {
                dynamicLoader.createAudienceNetworkAdsApi().initialize(context, multithreadedBundleWrapper, initListener);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DynamicLoader doMakeLoader(Context context, boolean z) throws Exception {
        AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
        DynamicLoader dynamicLoader = atomicReference.get();
        if (dynamicLoader == null) {
            if (!LOAD_FROM_ASSETS) {
                dynamicLoader = (DynamicLoader) Class.forName("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                dynamicLoader = (DynamicLoader) makeAdsSdkClassLoader(context.getApplicationContext()).loadClass("com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl").newInstance();
                Log.d(AudienceNetworkAds.TAG, "SDK dex loading time: " + (System.currentTimeMillis() - currentTimeMillis));
            }
            if (z) {
                dynamicLoader.maybeInitInternally(context);
            }
            atomicReference.set(dynamicLoader);
        }
        return dynamicLoader;
    }

    @InterfaceC11300zs1
    @SuppressLint({"PrivateApi", "CatchGeneralException"})
    private static Context getApplicationContextViaReflection() {
        try {
            return (Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Throwable th) {
            Log.e(AudienceNetworkAds.TAG, "Failed to fetch Context from  ActivityThread. Audience Network SDK won't work unless you call AudienceNetworkAds.buildInitSettings().withListener(InitListener).initialize().", th);
            return null;
        }
    }

    private static File getCacheCodeDirLegacy(Context context, File file) throws IOException {
        File file2 = new File(file, CODE_CACHE_DIR);
        try {
            mkdirChecked(file2);
            return file2;
        } catch (IOException unused) {
            File dir = context.getDir(CODE_CACHE_DIR, 0);
            mkdirChecked(dir);
            return dir;
        }
    }

    private static File getCodeCacheDir(Context context, File file) throws IOException {
        return context.getCodeCacheDir();
    }

    @InterfaceC11300zs1
    public static DynamicLoader getDynamicLoader() {
        return sDynamicLoader.get();
    }

    private static File getSecondaryDir(File file) throws IOException {
        File file2 = new File(file, "audience_network");
        mkdirChecked(file2);
        return file2;
    }

    public static void initialize(Context context, @InterfaceC11300zs1 MultithreadedBundleWrapper multithreadedBundleWrapper, @InterfaceC11300zs1 AudienceNetworkAds.InitListener initListener, boolean z) {
        if (!z && sInitializing.getAndSet(true)) {
            return;
        }
        new Thread(new a(context, z, multithreadedBundleWrapper, initListener)).start();
    }

    public static synchronized boolean isFallbackMode() {
        boolean z;
        synchronized (DynamicLoaderFactory.class) {
            z = sFallbackMode;
        }
        return z;
    }

    private static ClassLoader makeAdsSdkClassLoader(Context context) throws Exception {
        if (Build.VERSION.SDK_INT >= 30) {
            return createInMemoryClassLoader(context);
        }
        return makeLegacyAdsSdkClassLoader(context);
    }

    private static DexClassLoader makeLegacyAdsSdkClassLoader(Context context) throws Exception {
        String path = context.getFilesDir().getPath();
        String[] list = context.getAssets().list("audience_network");
        if (list != null && list.length != 0) {
            String[] strArr = new String[list.length];
            for (int i = 0; i < list.length; i++) {
                String str = list[i];
                StringBuilder sb = new StringBuilder();
                sb.append(path);
                String str2 = File.separator;
                sb.append(str2);
                sb.append(str);
                strArr[i] = sb.toString();
                InputStream open = context.getAssets().open("audience_network" + str2 + str);
                FileOutputStream fileOutputStream = new FileOutputStream(strArr[i]);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                    }
                }
                open.close();
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            return new DexClassLoader(M80.a(File.pathSeparator, strArr), context.getDir(OPTIMIZED_DEX_PATH, 0).getPath(), null, DynamicLoaderFactory.class.getClassLoader());
        }
        Log.e(AudienceNetworkAds.TAG, "Failed to find assets in audience_network");
        throw new RuntimeException("Failed to find assets in audience_network");
    }

    public static synchronized DynamicLoader makeLoader(Context context) {
        DynamicLoader makeLoader;
        synchronized (DynamicLoaderFactory.class) {
            makeLoader = makeLoader(context, true);
        }
        return makeLoader;
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoaderUnsafe() {
        synchronized (DynamicLoaderFactory.class) {
            AtomicReference<DynamicLoader> atomicReference = sDynamicLoader;
            if (atomicReference.get() == null) {
                Context applicationContextViaReflection = getApplicationContextViaReflection();
                if (applicationContextViaReflection != null) {
                    return makeLoader(applicationContextViaReflection, true);
                }
                throw new RuntimeException("You must call AudienceNetworkAds.buildInitSettings(Context).initialize() before you can use Audience Network SDK.");
            }
            return atomicReference.get();
        }
    }

    private static void mkdirChecked(File file) throws IOException {
        File parentFile;
        String str;
        file.mkdir();
        if (!file.isDirectory()) {
            if (file.getParentFile() == null) {
                str = "Failed to create dir " + file.getPath() + ". Parent file is null.";
            } else {
                str = "Failed to create dir " + file.getPath() + ". parent file is a dir " + parentFile.isDirectory() + ", a file " + parentFile.isFile() + ", exists " + parentFile.exists() + ", readable " + parentFile.canRead() + ", writable " + parentFile.canWrite();
            }
            Log.e(AudienceNetworkAds.TAG, str);
            throw new IOException("Failed to create directory " + file.getPath() + ", detailed message: " + str);
        }
    }

    public static synchronized void setFallbackMode(boolean z) {
        synchronized (DynamicLoaderFactory.class) {
            try {
                if (z) {
                    sDynamicLoader.set(DynamicLoaderFallback.makeFallbackLoader());
                    sFallbackMode = true;
                } else {
                    sDynamicLoader.set(null);
                    sFallbackMode = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static String stackTraceToString(Throwable th) {
        return Log.getStackTraceString(th);
    }

    @SuppressLint({"CatchGeneralException"})
    public static synchronized DynamicLoader makeLoader(Context context, boolean z) {
        DynamicLoader doMakeLoader;
        synchronized (DynamicLoaderFactory.class) {
            Preconditions.checkNotNull(context, "Context can not be null.");
            doMakeLoader = doMakeLoader(context, z);
        }
        return doMakeLoader;
    }
}
