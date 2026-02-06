package o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: o.bE  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5276bE extends URLConnection implements AutoCloseable {
    public final URLConnection X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5276bE(URLConnection uRLConnection) {
        super(uRLConnection.getURL());
        Objects.requireNonNull(uRLConnection, "urlConnection");
        this.X = uRLConnection;
    }

    public static C5276bE a(URI uri) throws IOException {
        Objects.requireNonNull(uri, "uri");
        return d(uri.toURL());
    }

    public static C5276bE d(URL url) throws IOException {
        return new C5276bE(url.openConnection());
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.X.addRequestProperty(str, str2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        C7743lL0.x(this.X);
    }

    @Override // java.net.URLConnection
    public void connect() throws IOException {
        this.X.connect();
    }

    public boolean equals(Object obj) {
        return this.X.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.X.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.X.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public Object getContent() throws IOException {
        return this.X.getContent();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.X.getContentEncoding();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.X.getContentLength();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.X.getContentLengthLong();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.X.getContentType();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.X.getDate();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.X.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.X.getDoInput();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.X.getDoOutput();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.X.getExpiration();
    }

    @Override // java.net.URLConnection
    public String getHeaderField(int i) {
        return this.X.getHeaderField(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldDate(String str, long j) {
        return this.X.getHeaderFieldDate(str, j);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i) {
        return this.X.getHeaderFieldInt(str, i);
    }

    @Override // java.net.URLConnection
    public String getHeaderFieldKey(int i) {
        return this.X.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j) {
        return this.X.getHeaderFieldLong(str, j);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.X.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.X.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() throws IOException {
        return this.X.getInputStream();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.X.getLastModified();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() throws IOException {
        return this.X.getOutputStream();
    }

    @Override // java.net.URLConnection
    public Permission getPermission() throws IOException {
        return this.X.getPermission();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.X.getReadTimeout();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.X.getRequestProperties();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.X.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.X.getURL();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.X.getUseCaches();
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z) {
        this.X.setAllowUserInteraction(z);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i) {
        this.X.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z) {
        this.X.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z) {
        this.X.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z) {
        this.X.setDoOutput(z);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j) {
        this.X.setIfModifiedSince(j);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i) {
        this.X.setReadTimeout(i);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.X.setRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z) {
        this.X.setUseCaches(z);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.X.toString();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) throws IOException {
        return this.X.getContent(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.X.getHeaderField(str);
    }
}
