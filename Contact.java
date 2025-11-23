public class Contact {
    private String name;
    private String netId;

    public Contact(String name, String netId) {
        this.name = name;
        this.netId = netId;
    }

    public String getNetId() {
        return netId;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        return this.netId.equals(other.netId);
    }

    @Override
    public int hashCode() {
        return netId.hashCode();
    }
}
