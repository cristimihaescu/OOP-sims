package ConstructionBusiness;

public class Main {
    public static void main(String[] args){
        Worker worker = new Worker("John", 400, 6);
        Worker worker2 = new Worker("Tim", 400, 6);
        Engineer engineer = new Engineer("Mark", 700, 40);
        Supervisor supervisor = new Supervisor("Lucy", 700, 5);
        SiteManager siteManager = new SiteManager("Frank", 1000, 20);

        ConstructionSite officeBuilding = new OfficeBuilding();
        officeBuilding.addWorker(worker);
        officeBuilding.addWorker(worker2);
        officeBuilding.addSiteManager(siteManager);
        officeBuilding.addSupervisor(supervisor);
        officeBuilding.addEngineer(engineer);
        officeBuilding.isSiteManager();

        if(officeBuilding.isSiteManager()){
            System.out.println("Your Office Building is running" );
        }
    }
}
