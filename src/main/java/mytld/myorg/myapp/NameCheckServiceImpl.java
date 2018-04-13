package mytld.myorg.myapp;

public class NameCheckServiceImpl implements NameCheckService {

    @Override
    public boolean isValid(String name) {
        return name.length() > 2;
    }

}
